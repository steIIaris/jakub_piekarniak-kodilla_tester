public class FirstClass {
    public static void main(String[] args) {
       Notebook notebook = new Notebook(600,1000,2014);
        System.out.println(notebook.weight +" "+ notebook.price +" "+ notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkQuality();

        Notebook heavyNotebook = new Notebook(2000,1500,2020);
        System.out.println(heavyNotebook.weight+" "+ heavyNotebook.price +" "+ heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkQuality();

        Notebook oldNotebook = new Notebook(1600,500,2017);
        System.out.println(oldNotebook.weight+" "+ oldNotebook.price +" "+ oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkQuality();

        Notebook xNotebook = new Notebook(1100, 600,2021);
        System.out.println(xNotebook.weight+" "+ xNotebook.price +" "+ xNotebook.year);
        xNotebook.checkPrice();
        xNotebook.checkWeight();
        xNotebook.checkQuality();

        }
    }