class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for token in tokens:
            if token in {"+", "-", "*", "/"}:
                top = stack.pop()
                secondTop = stack.pop()

                match token:
                    case "+":
                        stack.append(secondTop + top)

                    case "-":
                        stack.append(secondTop - top)

                    case "*":
                        stack.append(secondTop * top)

                    case "/":
                        stack.append(int(secondTop / top))

            else:
                stack.append(int(token))

        return stack[-1]