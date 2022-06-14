package StatePattern;

class Party implements IState {

    @Override
    public void alert(StateContext ctx) {
        System.out.println("Alert Party...");
    }

    @Override
    public String getState(StateContext ctx) {

        return ctx.stateName;
    }

    @Override
    public void changeTheme(StateContext ctx) {
        System.out.println("Theme yellow...");
    }
}
