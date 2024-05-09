def calcular_imposto(salario):
    imposto = 0.00
    if (salario >= 0 and salario <= 1100):
        imposto = 0.05
    elif (salario >= 1100.1 and salario <= 2500):
        imposto = 0.10
    else:
        imposto = 0.15
    return imposto * salario

salario = float(input("Qual o valor do seu salário?"))
beneficio = float(input("Qual o valor do seu beneficio?"))

imposto = calcular_imposto(salario)

saida = salario - imposto + beneficio

print("Seu salário após o desconto do imposto (R$ " + f'{imposto: .2f}' + ") é R$ " + f'{saida: .2f}')