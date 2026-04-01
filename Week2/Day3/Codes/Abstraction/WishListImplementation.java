package org.kumaransystems.week2.day3;

public class WishListImplementation1 implements WishList{
    
public void addToWishlist(){
System.out.println("Wishlist added");
}

public void showWishList(){
   System.out.println("showWishlist"); 
}

public void logout(){
    System.out.println("Logout");
}


public void selectWishList(){
    System.out.println("selectWishList");
}




public static void main(String[] args) {
    WishListImplementation1 options=new WishListImplementation1();
    options.addToWishlist();
    options.showWishList();
}

}
