package kiloboltgame;


public class Robot {
	//In Java, Class Variables should be private so that only its methods can change them.
		private int centerX = 100;
		private int centerY = 384;
		private boolean jumped = false;

		private int speedX = 0;
		private int speedY = 1;

		public void update() {
			

			// Moves Character or Scrolls Background accordingly.
			if (speedX < 0) {
				centerX += speedX;
			} else if (speedX == 0) {
				//System.out.println();

			} else {
				if (centerX <= 750) {
					centerX += speedX;
				} else {
					System.out.println("Scroll Background Here");
				}
			}
			
			// Updates Y Position

			if (centerY + speedY >= 384) {
				centerY = 384;
			}else{                       
	                     centerY += speedY;
	                }

			// Handles Jumping
			if (jumped == true) {
				speedY += 1;

				if (centerY + speedY >= 384) {
					centerY = 384;
					speedY = 0;
					jumped = false;
				}

			}

			// Prevents going beyond X coordinate of 0
			if (centerX + speedX <= 60) {
				centerX = 61;
			}
		}

		public void moveRight() {
			speedX = 6;
		}

		public void moveLeft() {
			speedX = -6;
		}

		public void stop() {
			speedX = 0;
		}

		public void jump() {
			if (jumped == false) {
				speedY = -15;
				jumped = true;
			}

		}

		public int getCenterX() {
			return centerX;
		}

		public int getCenterY() {
			return centerY;
		}

		public boolean isJumped() {
			return jumped;
		}

		public int getSpeedX() {
			return speedX;
		}

		public int getSpeedY() {
			return speedY;
		}

		public void setCenterX(int centerX) {
			this.centerX = centerX;
		}

		public void setCenterY(int centerY) {
			this.centerY = centerY;
		}

		public void setJumped(boolean jumped) {
			this.jumped = jumped;
		}

		public void setSpeedX(int speedX) {
			this.speedX = speedX;
		}

		public void setSpeedY(int speedY) {
			this.speedY = speedY;
		}
}
