print('\033[34m-=\033[m'*20)
print('Sistema de Análise de Velocidade')
print('\033[34m-=\033[m'*20)
# Atributos
placa = input('Digite a Placa do Veículo Analisado:  ').strip().upper()
carroV = int(input('Digite a Velocidade Detectada em Km/h: '))
maximaV = int(input('Digite a Velocidade Máxima Permitida em Km/h: '))
mMedia = maximaV + (maximaV * 20)/100
mGrave1 = maximaV + (maximaV * 21)/100
mGrave2 = maximaV + (maximaV * 50)/100
mGG = maximaV + (maximaV * 51)/100

if carroV >= mGG:
    print('=' * 20)
    print('\033[01;37mVeículo de placa {} muito acima da Velocidade Permitida na Rodovia!\033[m '.format(placa))
    print('\033[31mInfração Gravíssima! Multa a ser aplicada no valor de R$ 880,41.\033[m')
    print('=' * 20)
elif mGrave1 < carroV <= mGrave2:
    print('=' * 20)
    print('\033[01;37mVeículo de placa {} acima da Velocidade Permitida na Rodovia\033[m! '.format(placa))
    print('\033[31mInfração Grave! Multa a ser aplicada no valor de R$ 195,23.\033[m')
    print('=' * 20)
elif carroV > mMedia:
    print('=' * 20)
    print('\033[01;37mVeículo de placa {} acima da Velocidade Permitida na Rodovia!\033[m '.format(placa))
    print('\033[33mInfração Média! Multa a ser aplicada no valor de R$ 130,16.\033[m')
    print('=' * 20)
else:
    print('=' * 20)
    print('\033[01;37mVeículo de placa {} não infringiu a velocidade permitida!\033[m '.format(placa))
    print('\033[32mVeículo Liberado!\033[m')
    print('=' * 20)
print('Fim do Programa')
