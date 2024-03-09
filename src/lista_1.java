class lista_1 {
    static String  function_zad4(int x) {
        String sum_string="";
        if (x%3==0)     sum_string+="trzy";
        if (x%5==0)     sum_string+="piec";
        if (x%7==0)     sum_string+="siedem";
        if (x%11==0)    sum_string+="jedenascie";
        if (x%13==0)    sum_string+="trzynascie";
        if (x%15==0)    sum_string+="pietnascie";
        if (x%21==0)    sum_string+="dwadziesciajeden";
        return sum_string;
    }

    public static void main(String[] args) {
        String result_string;
        result_string=function_zad4(77);

        System.out.println(result_string);
    }
}