
public class tileSpace
	{
		protected String name;
		protected int value;
		protected String color;
		
		public tileSpace(String n,String c, int v)
			{
				setName(n);
				setValue(v);
				setColor(c);
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getValue()
			{
				return value;
			}
		public void setValue(int value)
			{
				this.value = value;
			}
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
	}