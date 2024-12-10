public class MyRunner {

    public static void main(String[] args) {

        DemoClass dObj = new DemoClass();
        //Initialize the class with integer data
        dObj.genericsMethod(25); //passing int
        dObj.genericsMethod("Per Scholas"); //passing String
        dObj.genericsMethod(2563.5); //passing float
        dObj.genericsMethod('H'); //passing char
        System.out.println();


        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype<>("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype<>("Per Scholas", "Non-Profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
    }
}