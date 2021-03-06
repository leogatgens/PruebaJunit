package StatePattern;

class Vibration implements IState {
    @Override
    public void alert(StateContext ctx) {
        System.out.println("Alert vibration...");
    }

    @Override
    public String getState(StateContext ctx) {

        return ctx.stateName;
    }

    @Override
    public void changeTheme(StateContext ctx) {
        System.out.println("Theme Blue...");
    }

}
