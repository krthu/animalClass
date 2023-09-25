public abstract class Animal {
    protected String name;


    public Animal (String name){
        this.name = name;
    }

    public void eat (String food){
        System.out.println(name + " eating " + food);
    }

    public void drinks(){
        System.out.println(name + " drinks water");
    }


}
