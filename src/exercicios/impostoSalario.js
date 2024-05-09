const salario = parseFloat(gets());
const beneficio = parseFloat(gets());

const imposto = calcularImposto(salario);

const saida = salario - imposto + beneficio;
print(saida.toFixed(2));

function calcularImposto(salario, beneficio) {
    let imposto = 0;
    if (salario >= 0 && salario <= 1100) {
        imposto = 0.05 * salario;
    } else if (salario >= 1100.1 && salario <= 2500) {
        imposto = 0.10 * salario;
    } else {
        imposto = 0.15 * salario;
    } 

    const salarioLiquido = salario - imposto + beneficio;
    return { imposto, salarioLiquido };
}
