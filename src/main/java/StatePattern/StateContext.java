package StatePattern;

public class StateContext {
    private IState currentState;
    public String stateName;

    public StateContext() {
        currentState = new Vibration();
        stateName = currentState.getClass().getSimpleName();
    }

    public void setState(IState state) {
        currentState = state;
        stateName = state.getClass().getSimpleName();
    }

    public void alert() {
        currentState.alert(this);
    }

    public void changeTheme() {
        currentState.changeTheme(this);
    }

    public String getState() {
       return currentState.getState(this);
    }
}
