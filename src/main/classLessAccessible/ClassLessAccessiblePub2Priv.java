package main.classLessAccessible;

private class ClassLessAccessiblePub2Priv {

	private class ClassLessAccessiblePub2PrivInner {
		
		public int publicField;
		private int privateField;
		
		public int publicMethod() {
			return 0;
		}
		
		public int privateMethod() {
			return 0;
		}
	}
}
