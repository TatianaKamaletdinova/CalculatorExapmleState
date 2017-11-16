package Calculator;


public class Context {

    int x, y; char o;
    State state;

    public Context ()
    {
        state = new StateX();
        state.clear(this);

    }

    public void press(char key)
    {
        switch (key)
        {
            case 'c':state.clear(this);break;
            case 'C': state.clear(this);break;
            case '0':state.digit(this, key);break;
            case '1':state.digit(this, key);break;
            case '2':state.digit(this, key);break;
            case '3':state.digit(this, key);break;
            case '4':state.digit(this, key);break;
            case '5':state.digit(this, key);break;
            case '6':state.digit(this, key);break;
            case '7':state.digit(this, key);break;
            case '8':state.digit(this, key);break;
            case '9': state.digit(this, key);break;
            case '/':state.arifm(this,key);break;
            case '*':state.arifm(this,key);break;
            case '+':state.arifm(this,key);break;
            case '-':state.arifm(this,key);break;
            case '=':state.equal(this);break;
        }
    }

    public int run (String keys){
        for (char key : keys.toCharArray()   )
            press(key);
        return  x;
    }

    @Override
    public String toString()
    {
       return " x= " +x + " y=" +y + " op= "+o+ " state= "+state.getClass().getName();
        //return " x= " +x;
    }
}
