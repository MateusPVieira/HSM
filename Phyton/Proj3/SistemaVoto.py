
print('-=' * 20)
print(f'{"Sistema de Eleição":^35}')
print('-=' * 20)
chapaAma = ''
chapaVer = ''
chapaAzu = ''
apartamentos = {}
n = 0
votosA = votosB = votosC = votosNulos = votosBranco = 0

while n < 35:
    apartamentos[n+1] = 'voto'
    n += 1


chapas = int(input(f'{"Quantas Chapas disputarão a Eleição? (2 a 3 chapas permitidas)"} : ').strip())
while 1 < chapas > 3:
    print()
    print('Insira um número válido de Chapa [2 ~ 3]')
    chapas = int(input('Quantas Chapas disputarão a Eleição? (2 a 3 chapas permitidas): ').strip())
print()
print('----------Cadastro de Candidatos---------')
if chapas == 3:
    chapaAma = input('Qual o Represantante da Chapa Amarela?: ')
    print()
    chapaVer = input('Qual o Represantante da Chapa Vermelha?: ')
    print()
    chapaAzu = input('Qual o Represantante da Chapa Azul?: ')

elif chapas == 2:
    chapaAma = input('Qual o Represantante da Chapa Amarela?: ')
    print()
    chapaVer = input('Qual o Represantante da Chapa Vermelha?: ')

print()
print('-=' * 20)
print(f'{"VOTAÇÃO":^35}')
print('-=' * 20)
print()
continuar = ' '
while continuar != 'N':
    ap = int(input('Qual seu apartamento?: ').strip())
    if chapas == 3:
        if apartamentos[ap] != 'voto':
            print('Esse apartamento já atingiu o número máximo de votos! \n Voto não computado!')
            print()
        else:
            print()
            apartamentos[ap] = input(f'Em quem você quer votar? (Digite a letra correspondente ao candidato): \n '
                                     f'A - {chapaAma} \n B - {chapaVer} \n C - {chapaAzu} \n '
                                     f'X - Voto em Branco \n').upper().strip()
            print('Voto Computado!')
            print()
    elif chapas == 2:
        if apartamentos[ap] != 'voto':
            print('Esse apartamento já atingiu o número máximo de votos! \n Voto não computado!')
            print()
        else:
            print()
            apartamentos[ap] = input(f'Em quem você quer votar?(Digite a letra correspondente ao candidato):'
                                     f' \n A - {chapaAma} \n B - {chapaVer}  \n X - Voto em Branco \n').upper().strip()
            print('Voto Computado!')
            print()
    continuar = input('Há mais pessoas para votar? [S/N]: ').strip().upper()
for d in apartamentos:
    if apartamentos[d] == 'A':
        votosA += 1
    elif apartamentos[d] == 'B':
        votosB += 1
    elif apartamentos[d] == 'C':
        if chapas == 2:
            votosNulos += 1
        else:
            votosC += 1
    elif apartamentos[d] == 'X':
        votosBranco += 1
    else:
        votosNulos += 1
pVotosBranco = (votosBranco * 100)/35
pVotosNulo = (votosNulos * 100)/35
print('-'*30)
print(f'{"Resultado da Eleição":^35}')
print('-'*30)
print()
if chapas == 2:
    print(f'O candidato da Chapa Amarela "{chapaAma}" obteve {votosA} voto(s)')
    print(f'O candidato da Chapa Vermelha "{chapaVer}" obteve {votosB} voto(s)')
else:
    print(f'O candidato da Chapa Amarela "{chapaAma}" obteve {votosA} voto(s)')
    print(f'O candidato da Chapa Vermelha "{chapaVer}" obteve {votosB} voto(s)')
    print(f'O candidato da Chapa Azul "{chapaAzu}" obteve {votosC} voto(s)')
print(f'Total de votos em Branco: {votosBranco}, totalizando {pVotosBranco:.1f}% dos votos')
print(f'Total de votos Nulos: {votosNulos}, totalizando {pVotosNulo:.1f}% dos votos')
print('FIM DO PROGRAMA')

