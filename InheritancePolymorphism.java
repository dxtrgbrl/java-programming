class InheritancePolymorphism{

	public static void main(String[] args)
	{		
		PrimativeShape[] objPrimatives = new PrimativeShape[3];
		objPrimatives[0] = new Circle();
		objPrimatives[1] = new Square();
		objPrimatives[2] = new Triangle();

		for (int i = 0; i < objPrimatives.length; i++)
			objPrimatives[i].WhatAmI();
		

		System.out.println();
	}

}

