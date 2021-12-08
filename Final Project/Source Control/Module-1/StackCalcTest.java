public class StackCalcTest {
    public static void main(String[] args) {
        StackCalc stackCalc = new StackCalc();
        String[] values = {"3", "5", "9", "*", "+"};
		
		//calls StackCalc object and sends values for the stack
		stackCalc.enterValues(values);
		//Returns the values in the stack from StackCalc class
        System.out.println(stackCalc.getStack());
		//Returns the answer to the operation of a post-fix calculator
        System.out.println(stackCalc.answer());
    }
}