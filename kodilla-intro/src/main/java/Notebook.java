public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight,int price,int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if(this.price<600){
            System.out.println("This notebook is very cheap.");
        }
        else if(this.price>600 && this.price<=1000) {
            System.out.println("This price is good");
        }
        else {
            System.out.println("This notebook is expensive");
        }

    }
    public void checkWeight(){
        if(this.weight<1000){
            System.out.println("This notebook light");
        }
        else if (this.weight>1000 && this.weight<=1500) {
            System.out.println("This notebook is not so heavy");
        }
        else {
            System.out.println("This notebook is heavy");
        }
    }
    public void checkQuality(){
        if (this.price<1000 && this.year>2020) {
            System.out.println("This notebook is good purchase");
        }
            else if (this.price>1000 && this.year>2020) {
                System.out.println("This notebook is expensive but worth its price");
            }
                else {
            System.out.println("This notebook is probably bad purchase");
        }



    }
}
