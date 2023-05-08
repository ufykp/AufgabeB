class Main {
    public static void main(String args[]) {

        Person person = new Person("Maxi Musterperson", 42 ,176);//the order of the 2 parameter ist reversed
        //If people want to create an object,  need to implement it through the new keyword, which is missing here

        System.out.println(person.name + "is" + person.height + " cm tall.");//"height" is misspelled "high"
        //Because println() is a method, a class 'System' is required,
        // and out represents the output attribute. so:'System.out.println()' indicates outputting one sentence
    }
}
