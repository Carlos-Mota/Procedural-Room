class Room extends Sprite {
  // These values hold grid coordinates for each corner of the room.
  public var x1: Int;
  public var x2: Int;
  public var y1: Int;
  public var y2: Int;

  // width and height of room in terms of grid
  public var w: Int;
  public var h: Int;

  // center point of the room
  public var center: Point;

  // constructer for creating new rooms
  public function new(x:Int, y:Int, h:Int) {
    super();

    x1 = x;
    x2 = x + w;
    y1 = y;
    y2 = y+ h
    
  }
}
