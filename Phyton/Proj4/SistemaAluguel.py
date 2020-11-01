from time import sleep


def nomemodelo(num):
    global nmodelo
    if num == 1:
        nmodelo = 'SUV'
    elif num == 2:
        nmodelo = 'Sedan'
    elif num == 3:
        nmodelo = 'Econômico'


def valoraluguel():
    global vmodelo, valuguel, dias, vseguro, modelo, vdiarias
    if modelo == 1:
        vmodelo = 85.00
    elif modelo == 2:
        vmodelo = 60.00
    elif modelo == 3:
        vmodelo = 35.00
    vdiarias = (vmodelo * dias)
    if dias >= 7:
        vdiarias = (vdiarias * 85)/100
        print('Por ter alugado o veículo por 7 dias ou mais você recebeu um desconto de 15% nas diárias!')
    valuguel = vdiarias + vopcionais + (20 * dias) + 75.00


def opcionais():
    global vopcionais, opc2, testeopc, dias
    print('_________________________________________________\n'
          'Opcionais:\n'
          'Tabela de Preços:\n'
          '1 - GPS                 ________________ R$12,00/Dia\n'
          '2 - Bebê Conforto       ________________ R$15,00/Dia\n'
          '3 - Cadeira de Bebê     ________________ R$15,00/Dia\n'
          '4 - Assento de Elevação ________________ R$15,00/Dia\n')
    while True:
        testeopc = int(input('Digite o número correspondente aos opcional:'))
        if testeopc in opc2 and testeopc == 1:
            print('GPS já adicionado! Não poderá ser adicionado novamente!')
        else:
            opc2.append(testeopc)
        resp2 = input('Deseja adicionar mais um item? [S/N]').upper()
        if resp2 in 'N':
            break
    for n in range(0, len(opc2)):
        if opc2[n] == 1:
            vopcionais += (12.00 * dias)
        else:
            vopcionais += (15.00 * dias)


def imprimirnota():
    file = open('aluguel.txt', 'w')
    file.write(f'Tipo do Carro: {nmodelo} \n')
    if dias >= 7:
        file.write(f'{dias} Diárias                 Total\n')
        file.write(f'{dias} x R${vmodelo}                R${vdiarias} (15% de Desconto)\n')

    else:
        file.write(f'{dias} Diárias                 Total\n')
        file.write(f'{dias} x R${vmodelo}                R${vdiarias}\n')
    file.write('-----------------------------------------------------\n')
    file.write(f'Seguro do Carro:\n{dias} x R$20,00               R${dias * 20}\n')
    file.write('-----------------------------------------------------\n')
    for y in opc2:
        if y == 1:
            file.write(f'GPS - {dias} x R$12,00     R${dias * 12}\n')
        elif y == 2:
            file.write(f'Bebê Conforto - {dias} x R$15,00     R${dias * 15}\n')
        elif y == 3:
            file.write(f'Cadeira de bebê - {dias} x R$15,00     R${dias * 15}\n')
        elif y == 4:
            file.write(f'Assento de Elevação - {dias} x R$15,00     R${dias * 15}\n')
    file.write('-----------------------------------------------------\n')
    file.write('Taxa Administrativa       R$75,00\n')
    file.write('-----------------------------------------------------\n')
    file.write(f'Total do Aluguel          R${valuguel}')
    file.close()


valuguel = vmodelo = vopcionais = testeopc = vseguro = vdiarias = 0
opc2 = []
nmodelo = ' '

print('='*50)
print(f'{"SISTEMA DE LOCAÇÃO DE VEÍCULOS":^50}')
print('='*50)
print('- Diárias:\n'
      ' 1 - SUV        _____________________ R$85,00\n'
      ' 2 - Sedan      _____________________ R$60,00\n'
      ' 3 - Econômico  _____________________ R$35,00\n'
      ' \n'
      'Valor do Seguro por Diária Obrigatório: R$20,00/Dia \n'
      'Taxa Administrativa Obrigatória: R$75,00\n'
      '_______________________________________________')
while True:
    modelo = int(input('Digite o número correspontente ao Modelo desejado: '))
    if modelo == 1 or modelo == 2 or modelo == 3:
        break
    else:
        print('Modelo não especificado na tabela! Por favor, tente novamente!')
nomemodelo(modelo)
dias = int(input(f'Por quantos dias você deseja alugar o Modelo {nmodelo}?: '))
opc1 = str(input('Deseja ver a lista de opcionais?[S/N]: ')).upper()
if opc1 in 'N':
    valoraluguel()
else:
    opcionais()
    valoraluguel()
print('Sua nota está sendo gerada, por favor aguarde...')
sleep(1)
print('.', end=' ', flush=True)
sleep(1)
print('.', end=' ', flush=True)
sleep(1)
print('.', flush=True)
sleep(1)
imprimirnota()
print('Nota gerada!')
sleep(0.75)
print('Obrigado! Volte Sempre!')
print(f'O valor gasto com o aluguel do modelo {nmodelo} foi R${valuguel:.2f}')


