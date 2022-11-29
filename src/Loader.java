public class Loader
{
    //напишите сдесь код использующий методы indexOf, lastIndexOf, substring, trim
    //которые будут считать сумму заработков всех друзей
    //числа могут быть разные в этом тексте, но программа должна уметь их извлекать и считать их сумму
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String numberOnly = text.replaceAll("[^0-9]", " ");
        numberOnly = numberOnly.replaceAll(" +", " ").trim();

        System.out.println(text);
        System.out.println(numberOnly);

        int vasyaZP = Integer.parseInt(numberOnly.substring(0, numberOnly.indexOf(' ')));
        int petyaZP = Integer.parseInt(numberOnly.substring(numberOnly.indexOf(' ') + 1, numberOnly.lastIndexOf(' ')));
        int mashaZP = Integer.parseInt(numberOnly.substring(numberOnly.lastIndexOf(' ') + 1));

        int sumAllWorkersSalary = vasyaZP + petyaZP + mashaZP;

        System.out.println(sumAllWorkersSalary);
    }
}