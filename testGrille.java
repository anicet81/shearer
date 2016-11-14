import static org.junit.Assert.*;

import org.junit.Test;


public class TestGrille {

	 GrilleImpl Test1 = new GrilleImpl();
	 
	 @Test
	 public void testGetDimension() {
	  if (Test1.getDimension() != 9) {  
	   fail("Problème avec le test de dimension");
	  }
	 }      

	 @Test
	 /** on teste la definition des valeurs.
	  * 
	  */
	 public void testSetValue() {
	  /** on teste la definition des valeurs.
	   * 
	   */
	 
	  Test1.setValue(1, 4, '1');
	  
	  if (Test1.magrille[1][4] != '1') {  
	   fail("Problème avec le test de case vide");
	  }  
	  try {
	  Test1.setValue(4, 3, '5');
	  }  catch (IllegalArgumentException e) {
	   
	  }
	    if (Test1.magrille[4][3] != '8') {  
	   fail("Problème avec le test de case pleine");
	  }
	  
	 }

	 @Test
	 
	 /** test l'obtention des valeurs.
	  * @param 
	  * @return vrai si la case a @ 
	  */
	 public void testGetValue() {
	  /** on teste l'obtention des valeurs pour la grille.
	   * 
	   */
	  /*if (Test1.getValue(3, 8)!=Test1.EMPTY){  
	   fail("Problème avec la récupération d'une case vide");
	  } */
	  if (Test1.getValue(1, 3) != '6') {  
	   fail("Problème avec la récupération d'une case ");
	  }
	 }

	 @Test
	 public void testComplete() {
	  /** on teste si la grille est complete.
	   * 
	   */
	 assertFalse("Problème avec le test d'une grille incomplète",
	   Test1.complete());
	 }

	 @Test
	 public void testPossible() {
	  /** on teste les cas possibles.
	   * 
	   */
	  assertFalse("Problème avec le cas d'une case vide", 
	    Test1.possible(2, 2, '6'));
	  assertFalse("Problème avec le cas d'une valeur non cohérente ", 
	    Test1.possible(1, 4, '6'));
	  assertTrue("Problème avec le cas d'une valeur cohérente ",
	    Test1.possible(0, 0, '4'));
	  

	}

}
