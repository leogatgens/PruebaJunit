package StatePattern;

class Silent implements IState {
    @Override
    public void alert(StateContext ctx) {
        System.out.println("Alert silent...");
    }

    @Override
    public String getState(StateContext ctx) {
        System.out.println(ctx.stateName);
        return ctx.stateName;
    }

    @Override
    public void changeTheme(StateContext ctx) {
        System.out.println("Theme Black...");
    }

}