public class Workshop {
    public static void main(String[] args) {

        Person p = new Person();
        System.out.println("Señor@: "+p.getNames()+" "+p.getLastName1()+" "+p.getLastName2()
                            +"El cual su fecha de nacimiento es: "+p.getDateBirth()
                            +"\nQueremos informarle que su Indice de Masa Corporal es de: "
                            +p.IMC());

        System.out.println("\n");
        Fruit f = new Fruit();
        f.information();

        System.out.println("\n");
        Bankaccount b = new Bankaccount();
        b.condition();

        System.out.println("\n");
        Desk d =new Desk();
        d.informations();

        System.out.println("\n");
        Cards c = new Cards();
        c.informations();


        System.out.println("\n");
        Animals a = new Animals();
        System.out.println("Tienes un "+a.getSpecies()+" llamado "+a.getName()+
                           "\n el cual su raza es "+a.getRace());
    }
}
