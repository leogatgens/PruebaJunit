package StatePattern;

interface IState {
    void alert(StateContext ctx);

    String getState(StateContext ctx);

    void changeTheme(StateContext ctx);
}
