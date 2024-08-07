class KeybunchRunner {
    public static void main(String[] args) {
        Key key1 = new Key( "Yale",100.5);
        Keybunch keybunch1 = new Keybunch("Metal", key1);
        keybunch1.details();
		
		Key key2 = new Key("MasterLock", 120.2);
        Keybunch keybunch2 = new Keybunch("Plastic", key2);
     	keybunch2.details();
   }
}
        