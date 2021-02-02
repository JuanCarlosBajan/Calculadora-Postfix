public class CalculadoraJuanBajan implements CalculadoraGeneral{

    Stack<Integer> db;

    public CalculadoraJuanBajan(){
        db = new StackVector<Integer>();
    }

    public String Calculo(String element){

        boolean works = true;
        String resp;

        for(int i=0;i<element.length();i++)
        {
            char c= element.charAt(i);

            if(Character.isDigit(c)) {
                db.push(c - '0');
            } else if (!Character.isDigit(c) && db.size()>1)
            {
                int a = db.pop();
                int b = db.pop();

                switch(c)
                {
                    case '+':
                        db.push(a+b);
                        break;

                    case '-':
                        db.push(b- a);
                        break;

                    case '/':
                        db.push(b/a);
                        break;

                    case '*':
                        db.push(a*b);
                        break;
                }
            } else if(!Character.isDigit(c) && db.size()<=1){
                works = false;
                resp = "NO JUNCIA";
            }

        }

        if(db.size() == 1){
            resp = db.pop().toString();
        } else {
            resp = "NO JUNCIA";
            works = false;
        }
            return resp;
    }
}
