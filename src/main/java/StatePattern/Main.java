package StatePattern;

class Main
    {
        public static void main(String[] args)
        {
            StateContext stateContext = new StateContext();
            stateContext.alert();
            stateContext.changeTheme();
            stateContext.getState();
            //Modo silent
            stateContext.setState(new Silent());
            stateContext.alert();
            stateContext.changeTheme();
            stateContext.getState();
            //Modo party
            stateContext.setState(new Party());
            stateContext.alert();
            stateContext.changeTheme();
            stateContext.getState();
        }
    }
