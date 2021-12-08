import java.util.Arrays;
import java.util.Stack;

class StackCalc {
	String values[];
	
	public void enterValues(String[] values) {
		this.values = values;
	}

	public String getStack() {
		return Arrays.toString(values);
	}

	public int answer() {
		Stack<Integer> stack = new Stack<>();
        
		int i = 0;
		while(i < values.length) {
			String x = values[i++];
            
			if("+-*/".contains(x)) {
				int a = stack.pop();
				int b = stack.pop();

				if(x.equals("+")) {
					stack.push(a + b);
				}
				if(x.equals("-")) {
					stack.push(b - a);
				}
				if(x.equals("*")) {
					stack.push(a * b);
				}
				if(x.equals("/")) {
					stack.push(b / a);
				}
			} else {
				stack.push(Integer.parseInt(x));
			}
		}
        
		return stack.peek();
	}

}