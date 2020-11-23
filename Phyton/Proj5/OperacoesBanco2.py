from random import randint
from random import uniform


def criarconta(txt):
    txt = {'nome': input('Qual seu nome completo?: ').title().strip(),
           'rmensal': float(input('Qual sua renda mensal?: R$ ')), 'agencia': randint(0, 999), 'saldo': 0}
    txt['saldoespec'] = (round(uniform(txt['rmensal'], (2*txt['rmensal'])), 2))
    return txt


