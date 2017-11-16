package Calculator;

public class StateX extends State {
    boolean typing = false;
    @Override
    void clear(Context context) { //стираем
        context.x=0;
        context.y=0;
        context.o='+';
    }

    @Override
    void digit(Context context, char key) { //вводим
        if (!typing)
        {
            context.x=0;
            typing = true;
        }
        context.x = context.x*10+Character.getNumericValue(key);
    }

    @Override
    void arifm(Context context, char key) { //оперируем
        context.state = new StateAction();
        context.state.arifm(context,key);
    }

    @Override
    void equal(Context context) {  // считаем
        context.state = new StateAnswer();
        context.state.equal(context);
    }
}
