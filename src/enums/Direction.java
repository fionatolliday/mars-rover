package enums;

public enum Direction {

   NORTH {
      public Direction getLeft(){
         return WEST;
      }

      public Direction getRight(){
         return EAST;
      }
   },


   SOUTH {
      public Direction getLeft(){
         return EAST;
      }

      public Direction getRight(){
         return WEST;
      }
   },


   EAST {
      public Direction getLeft(){
         return NORTH;
      }

      public Direction getRight(){
         return SOUTH;
      }
   },


   WEST {
      public Direction getLeft(){
         return SOUTH;
      }

      public Direction getRight(){
         return NORTH;
      }
   };

   public abstract Direction getLeft();
   public abstract Direction getRight();
}
