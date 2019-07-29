package enums;

public enum Direction {

   NORTH {
      public Direction getLeft(){
         return WEST;
      }

      public Direction getRight(){
         return EAST;
      }

      @Override
      public Direction getFront() {
         return NORTH;
      }

      @Override
      public Direction getBack() {
         return SOUTH;
      }
   },


   SOUTH {
      public Direction getLeft(){
         return EAST;
      }

      public Direction getRight(){
         return WEST;
      }

      @Override
      public Direction getFront() {
         return SOUTH;
      }

      @Override
      public Direction getBack() {
         return NORTH;
      }
   },


   EAST {
      public Direction getLeft(){
         return NORTH;
      }

      public Direction getRight(){
         return SOUTH;
      }

      @Override
      public Direction getFront() {
         return EAST;
      }

      @Override
      public Direction getBack() {
         return WEST;
      }
   },


   WEST {
      public Direction getLeft(){
         return SOUTH;
      }

      public Direction getRight(){
         return NORTH;
      }

      @Override
      public Direction getFront() {
         return WEST;
      }

      @Override
      public Direction getBack() {
         return EAST;
      }
   };

   public abstract Direction getLeft();
   public abstract Direction getRight();
   public abstract Direction getFront();
   public abstract Direction getBack();
}
