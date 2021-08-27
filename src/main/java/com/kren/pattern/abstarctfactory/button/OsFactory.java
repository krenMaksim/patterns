package com.kren.pattern.abstarctfactory.button;

abstract class OsFactory {

    public static OsFactory newInstance(Os os) {
        return os.getFactory();
    }

    OsFactory() {}

    abstract public Button createButton();

    abstract public Checkbox createCheckbox();
    
    public static enum Os {
        LINUX(new LinuxOsFactory()),
        
        WINDOWS(new WinOsFactory());
        
        private OsFactory factory;

        private Os(OsFactory facrory) {
            this.factory = facrory;
        }

        public OsFactory getFactory() {
            return factory;
        }
    }
}
