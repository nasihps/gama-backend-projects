public class first{

    //data members can be static or non-static state
    //anonymouse block

    {
        System.out.println("Hello kemcho !");
    }

    static{}
    //auxillary methods - constructors
    //mutators - accessor - set/get - provide public interface to private data
    //member methods - static and non-static

    //nested classes interfaces enums and records

    //classes can be declared in a class, in a method in a loop

    //anonymous calss - instatiation of an interface without implementing the interface

    Runnable r = new Runnable() {

        public void run() {
            System.out.println("from run method");
        }

    };

    {
        Runnable r1 = () -> {
            System.out.println("from run method second");
        };

        r1.run();
    }

    //java type systems
    //java operators
    //literal they are also known as constant representation of a value supported
    //integer, real, true, false, character keyboard keys, \n, \t, \b, \f, null
    //identifier: it is a name given to a
    //expression: combination operands and operators
    //operands: literal, constant, variable and method call
    //10+19

    char c = 65;
    {
        double x = Math.pow(2,2) + Math.max(10,20) - 600 ;
        System.out.println(65);
    }

    List<Integer> copyList = List.copyOf(someList);
    //copyList.add(4); //exception
    //toArray() method

    List<String> list = Arrays.asList("Like", "Share", "Subscribe", "JavaFreshers");
    String[] array = list.toArray(String[]::new);
    for(String s : array) {
        System.out.println(s);
    }

    //function, predicate,
    //Predicate.not()
    list = Arrays.asList("Like", "Share", "Subscribe", "", "JavaFreshers", "\n\n");
    System.out.println(list);
    List<String> withoutBlanks = list.stream()
            .filter(Predicate.not(String::isBlank))
            .collect(Collectors.toList());


}