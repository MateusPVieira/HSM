from random import randint

import OperacoesBanco2


def menu():
    while True:
        print()
        print(f'Menu:')
        print('1 ___________ Criar conta\n'
              '2 ___________ Ja possuo conta\n'
              '3 ___________ Sair\n')
        while True:
            r = input('Digite o numero da operacao desejada: ').strip()
            if r in '123':
                break
            else:
                print('Operacao invalida, tente novamente!')
        if r == '1':
            conta = randint(0, 9999)
            while conta in clientes.keys():
                conta = randint(0, 9999)
            else:
                clientes[conta] = OperacoesBanco2.criarconta(addclientes)
                print('Conta adicionada com sucesso!')
                print(f'Bem vindo ao Banco Dillinger, {str(clientes[conta]["nome"]).split(" ")[0]}')
                print(f'Sua conta e {conta} e sua Agencia e {clientes[conta]["agencia"]}.\n'
                      f'Guarde bem esses dados, voce so podera acessar sua conta com eles!')
                while True:
                    r2 = input('-------------------------------------------\n'
                               '1 - Abrir Menu de Conta\n'
                               '2 - Voltar ao Menu Geral\n'
                               'O que deseja fazer agora?: ').strip()
                    if r2 in "1":
                        menuconta()
                    elif r2 in "2":
                        break
                    else:
                        print('Por favor digite uma opcao valida')



        elif r == '2':
            pass
        else:
            print('Obrigado por usar o Banco Dillinger: O seu dinhero tambem e nosso dinheiro!')
            print('Terminal Encerrado!')
            break


def menuconta():
    global clientes
    while True:
        print()
        print('Menu de Conta:')
        print('1 _________________________ Depositar\n'
              '2 _________________________ Consultar Saldo\n'
              '3 _________________________ Saque\n'
              '4 _________________________ Credito Pre-Aprovado\n'
              '5 _________________________ Voltar')
        r = input('Digite o numero da operacao desejada: ').strip()
        if r in '1':
            conta = int(input('Qual o numero da conta que recebera o deposito?'))
            valor = float(input('Quanto deseja depositar?: R$ '))
            while True:
                if conta in clientes.keys():
                    clientes[conta]['saldo'] += valor
                    print(f'Deposito de R${valor:.2f} feito com sucesso na conta de {str(clientes[conta]["nome"])}!')
                    break
                else:
                    print('Essa conta nao existe! Tente novamente.')
                    break

        elif r in '2':
            conta = int(input('Qual o numero da conta que deseja ver o Saldo?'))
            while True:
                if conta in clientes.keys():
                    print(f'Ola {str(clientes[conta]["nome"]).split(" ")[0]}')
                    print(f'Seu saldo e de R${clientes[conta]["saldo"]:.2f}')
                    break
                else:
                    print('Essa conta nao existe! Tente novamente.')
                    break

        elif r in '3':
            conta = int(input('Qual o numero da conta que deseja Sacar?'))
            valor = float(input('Qual o valor que deseja sacar?: R$ '))
            while True:
                if conta in clientes.keys():
                    if clientes[conta]['saldo'] >= valor:
                        clientes[conta]['saldo'] -= valor
                        print(f'Ola {str(clientes[conta]["nome"]).split(" ")[0]} !')
                        print(f'Valor de R${valor:.2f} sacado com sucesso!')
                        print(f'Seu saldo agora e de R${clientes[conta]["saldo"]:.2f}')
                        break
                    else:
                        print(f'Saldo de R${clientes[conta]["saldo"]:.2f} insuficiente para realizar essa operacao!')
                        break
                else:
                    print('Essa conta nao existe! Tente novamente.')
                    break
        elif r in '4':
            r2 = input('Digite o numero da operacao: ').strip()
            while True:
                if r2 in '1':
                    if conta in clientes.keys():
                        print(f'Ola {str(clientes[conta]["nome"]).split(" ")[0]}')
                        print(f'Seu saldo pre-aprovado e de R${clientes[conta]["saldoespec"]:.2f}')
                    break
                if r2 in '2':
                    print(f'Ola {str(clientes[conta]["nome"]).split(" ")[0]}')
                    print(f'Seu saldo pre-aprovado e de R${clientes[conta]["saldoespec"]:.2f}')
                    break
            break
        elif r in '5':
            break
        else:
            print('Por favor, digite um numero valido!')

print('-' * 50)
print(f'{"Banco Dillinger":^50}')
print('-' * 50)
clientes = {}
addclientes = {}
menu()

