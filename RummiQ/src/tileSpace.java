
public q class tileSpace
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
		private String getName()
			{
				return name;
			}
		private void setName(String name)
			{
				this.name = name;
			}
		private int getValue()
			{
				return value;
			}
		private void setValue(int value)
			{
				this.value = value;
			}
		private String getColor()
			{
				return color;
			}
		private void setColor(String color)
			{
				this.color = color;
			}
	}