package StatePattern;

class Main
    {
        public static void main(String[] args)
        {
            var actualState = "";

            StateContext stateContext = new StateContext();
            stateContext.alert();
            stateContext.changeTheme();
            actualState = stateContext.getState();
            System.out.println(actualState);

            //Modo silent
            stateContext.setState(new Silent());
            stateContext.alert();
            stateContext.changeTheme();
            actualState = stateContext.getState();
            System.out.println(actualState);

            //Modo party
            stateContext.setState(new Party());
            stateContext.alert();
            stateContext.changeTheme();
            actualState = stateContext.getState();
            System.out.println(actualState);
        }
    }
