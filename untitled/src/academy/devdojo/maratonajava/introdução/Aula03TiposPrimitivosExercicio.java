package academy.devdojo.maratonajava.introdução;
/*
Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
eu <nome>, morando no <endereço>,
confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Kirito";
        String endereco = "Av joao das galileias";
        Double salario = 5431.12;
        String dataderecebimento = "20/12/21";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salario de "+salario+",na data "+dataderecebimento;
        System.out.println(relatorio);
    }
}
