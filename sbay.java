//  Author:      Azizul Chowdhury
//  Description: This is a simulation for the website of a fictionary electronic vendor named 'sbay'. 'sbay', an audio accessory store, allows
//               customers to purchase anything from the store's selection of 4 items, which includes a radio, a headphone, an earphone, and a microphone.


import java.awt.*;
import hsa.Console;

public class sbay
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	// Declaration of Variables and Constants

	char response,
	    addOrReturn1 = 'R', removeOrReturn1 = 'R',  // for item 1 (headphone)
	    addOrReturn2 = 'R', removeOrReturn2 = 'R',  // for item 2 (radio)
	    addOrReturn3 = 'R', removeOrReturn3 = 'R',  // for item 3 (earphone)
	    addOrReturn4 = 'R', removeOrReturn4 = 'R',  // for item 4 (microphone)
	    errorAcknowledge = 'X',
	    checkoutReturn = 'R',
	    finalStep = 'R';

	int headphone = 0, headphoneQuantity,
	    radio = 0, radioQuantity,
	    earphone = 0, earphoneQuantity,
	    microphone = 0, microphoneQuantity;

	final double headphonePrice = 78.99,
	    radioPrice = 18.99,
	    earphonePrice = 219.99,
	    microphonePrice = 74.99;

	double headphoneTotal = 0, radioTotal = 0, earphoneTotal = 0, microphoneTotal = 0;

	int totalItems = 0;

	double subTotal = 0, tax, total;

	// Input, Process, and Output

	/* --- WELCOME PAGE --- */

	// Pink background
	c.setColor (new Color (224, 102, 101));
	c.fillRect (0, 0, 2000, 2000);

	// Top grey bar
	c.setColor (new Color (67, 67, 67));
	c.fillRect (0, 0, 2000, 60);

	// "sbay"
	Font f = new Font ("Georgia", Font.PLAIN, 36);
	c.setFont (f);
	c.setColor (new Color (254, 0, 0)); // red
	c.drawString ("s", 15, 40);
	c.setColor (new Color (74, 134, 232)); // blue
	c.drawString ("b", 30, 40);
	c.setColor (new Color (255, 255, 1)); // yellow
	c.drawString ("a", 51, 40);
	c.setColor (new Color (0, 255, 1)); // green
	c.drawString ("y", 68, 40);

	// Line between "sbay" and "Est. 2018"
	c.setColor (Color.white);
	c.fillRect (100, 13, 2, 35);

	// Est. 2018
	Font f2 = new Font ("Century Gothic", Font.PLAIN, 24);
	c.setFont (f2);
	c.drawString ("Est. 2018", 120, 39);

	// 24/7 Help-desk: 1-800-111-SBAY
	Font f3 = new Font ("Century Gothic", Font.BOLD, 18);
	c.setFont (f3);
	c.drawString ("24/7 Help-desk: 1-800-111-SBAY", 353, 39);

	// "Welcome to sbay"

	// "Welcome to"
	Font f4 = new Font ("Candara", Font.BOLD, 36);
	c.setFont (f4);
	c.drawString ("Welcome to", 30, 200);

	// "sbay"
	Font f5 = new Font ("Georgia", Font.PLAIN, 72);
	c.setFont (f5);
	c.setColor (new Color (254, 0, 0)); // red
	c.drawString ("s", 50, 265);
	c.setColor (new Color (74, 134, 232)); // blue
	c.drawString ("b", 80, 265);
	c.setColor (new Color (255, 255, 1)); // yellow
	c.drawString ("a", 120, 265);
	c.setColor (new Color (0, 255, 1)); // green
	c.drawString ("y", 155, 265);

	// "Canada's Largest Audio Accessories Store"
	Font f6 = new Font ("Century Gothic", Font.ITALIC + Font.BOLD, 20);
	c.setFont (f6);
	c.setColor (Color.white);
	c.drawString ("Canada's Largest", 30, 310);
	c.drawString ("Audio Accessories Store", 30, 330);

	// "PRESS ENTER"

	// "See what we have to offer."
	c.setFont (f3);
	c.drawString ("See what we have to offer.", 360, 215);

	// Red button
	c.setColor (new Color (254, 0, 0));
	c.fillRoundRect (360, 230, 230, 60, 75, 75);

	// "PRESS ENTER"
	Font f7 = new Font ("Century Gothic", Font.BOLD, 24);
	c.setFont (f7);
	c.setColor (Color.white);
	c.drawString ("PRESS ANY KEY", 390, 268);

	// Colorful rectangles at bottom left

	c.setColor (new Color (254, 0, 0)); // red
	c.fillRect (15, 450, 80, 40);

	c.setColor (new Color (74, 134, 232)); // blue
	c.fillRect (110, 450, 80, 40);

	c.setColor (new Color (255, 255, 1)); // yellow
	c.fillRect (205, 450, 80, 40);

	c.setColor (new Color (0, 255, 1)); // green
	c.fillRect (300, 450, 80, 40);

	// User presses any key
	c.getChar ();

	/* --- INVENTORY PAGE --- */
	do
	{
	    // Pink background
	    c.setColor (new Color (224, 102, 101));
	    c.fillRect (0, 0, 2000, 2000);

	    // Top grey bar
	    c.setColor (new Color (67, 67, 67));
	    c.fillRect (0, 0, 2000, 60);

	    // "sbay"
	    c.setFont (f);
	    c.setColor (new Color (254, 0, 0)); // red
	    c.drawString ("s", 15, 40);
	    c.setColor (new Color (74, 134, 232)); // blue
	    c.drawString ("b", 30, 40);
	    c.setColor (new Color (255, 255, 1)); // yellow
	    c.drawString ("a", 51, 40);
	    c.setColor (new Color (0, 255, 1)); // green
	    c.drawString ("y", 68, 40);

	    // Line between "sbay" and "Est. 2018"
	    c.setColor (Color.white);
	    c.fillRect (100, 13, 2, 35);

	    // Est. 2018
	    c.setFont (f2);
	    c.drawString ("Est. 2018", 120, 39);

	    // 24/7 Help-desk: 1-800-111-SBAY
	    c.setFont (f3);
	    c.drawString ("24/7 Help-desk: 1-800-111-SBAY", 353, 39);

	    // "Inventory"
	    Font Title = new Font ("Candara", Font.BOLD, 24);
	    c.setFont (Title);
	    c.drawString ("OUR INVENTORY", 20, 100);

	    // Item 1: COWIN B9 BLUETOOTH HEADPHONES

	    // Red rectangle background behind item
	    c.setColor (new Color (254, 0, 0));
	    c.fillRect (20, 120, 145, 170);

	    // Red circle with "1" written in it
	    c.fillOval (13, 114, 30, 30);

	    // White outline of circle
	    c.setColor (Color.white);
	    c.drawOval (13, 114, 30, 30);

	    // "1"
	    c.setFont (f3);
	    c.drawString ("1", 24, 135);

	    // Picture of the item

	    // Top arc of headphone
	    c.setColor (new Color (67, 67, 67)); // grey
	    c.fillArc (58, 160, 63, 60, 0, 180);
	    c.setColor (new Color (254, 0, 0));  // red arc to fill in unnwanted grey part
	    c.fillArc (64, 165, 51, 50, 0, 180);

	    // Left bar (viewed from front)
	    c.setColor (new Color (67, 67, 67)); // grey
	    c.fillRect (58, 190, 6, 26);

	    // Left cushion
	    c.setColor (Color.black); // fill
	    c.fillOval (45, 207, 34, 34); // cushion
	    c.setColor (new Color (67, 67, 67)); // outline
	    c.drawOval (45, 207, 33, 33);

	    // Grey inner bit
	    c.setColor (new Color (67, 67, 67)); // grey
	    c.fillOval (57, 219, 10, 10);

	    // Right bar (viewed from front)
	    c.setColor (new Color (67, 67, 67)); // grey
	    c.fillRect (115, 190, 6, 34);

	    // Right cushion
	    c.setColor (Color.black); // fill
	    c.fillOval (96, 215, 42, 42); // shell
	    c.fillOval (91, 214, 40, 40); // cushion
	    c.setColor (new Color (67, 67, 67)); // outline
	    c.drawOval (96, 215, 41, 41);


	    // Item 2: Sony MX42-C Portable AM/FM Radio

	    // Blue rectangle background behind item
	    c.setColor (new Color (74, 134, 232));
	    c.fillRect (185, 120, 145, 170);

	    // Blue circle with "2" written in it
	    c.fillOval (178, 114, 30, 30);

	    // White outline of circle
	    c.setColor (Color.white);
	    c.drawOval (178, 114, 30, 30);

	    // "2"
	    c.setFont (f3);
	    c.drawString ("2", 189, 135);

	    // Picture of the item

	    // Radio body
	    c.setColor (new Color (241, 194, 50)); // yellowish orange
	    c.fillRoundRect (203, 190, 110, 57, 15, 15);

	    // Speaker
	    c.setColor (new Color (67, 67, 67)); // grey
	    c.fillOval (214, 202, 32, 32);
	    // There was supposed to be an outline but I removed it because it isn't noticable
	    c.setColor (new Color (37, 37, 37)); // darker grey oval
	    c.fillOval (223, 206, 16, 12);

	    // "Sony"
	    Font Sony1 = new Font ("Times New Roman", Font.PLAIN, 10);
	    c.setFont (Sony1);
	    c.drawString ("Sony", 246, 200);

	    // Antenna
	    c.setColor (new Color (183, 183, 183)); // light grey
	    c.fillRect (222, 167, 3, 23);

	    // Bottom and top grey bars
	    c.setColor (new Color (37, 37, 37));
	    c.fillRect (221, 187, 76, 3); // top
	    c.fillRect (221, 247, 76, 3); // bottom

	    // Volume adjuster
	    c.setColor (new Color (67, 67, 67)); // back
	    c.fillOval (280, 205, 17, 17);
	    c.setColor (Color.black); // front
	    c.fillOval (283, 208, 14, 14);

	    // I was going to write "Low" and "High" but it's too small to be visible here.

	    // On & Off slider
	    c.setColor (new Color (67, 67, 67)); // sliding area
	    c.fillRoundRect (265, 227, 17, 10, 5, 5);
	    c.setColor (new Color (37, 37, 37)); // button
	    c.fillRoundRect (272, 227, 13, 10, 5, 5);



	    // Item 3: Apple Airpods

	    // Yellow rectangle background behind item
	    c.setColor (new Color (255, 255, 1));
	    c.fillRect (20, 310, 145, 170);

	    // Yellow circle with "3" written in it
	    c.fillOval (13, 304, 30, 30);

	    // White outline of circle
	    c.setColor (Color.black);
	    c.drawOval (13, 304, 30, 30);

	    // "3"
	    c.setFont (f3);
	    c.drawString ("3", 24, 325);

	    // Picture of the item

	    // Left airpod

	    // Body
	    c.setColor (new Color (238, 238, 238)); // white
	    c.fillRect (68, 370, 8, 70);
	    c.setColor (new Color (217, 217, 217)); // light grey outline
	    c.drawRect (68, 370, 8, 70);

	    // Oval part which goes into ear
	    c.setColor (new Color (238, 238, 238)); // white
	    c.fillOval (38, 360, 42, 32);
	    c.setColor (new Color (217, 217, 217)); // light grey outline
	    c.drawOval (38, 360, 42, 32);

	    // Speaker oval
	    c.setColor (new Color (102, 102, 102));
	    c.fillOval (45, 368, 8, 15);

	    // Smaller oval in the middle
	    c.setColor (new Color (153, 153, 153));
	    c.fillOval (62, 374, 8, 3);

	    // Bottom grey bit
	    c.fillRect (68, 437, 8, 3);

	    // Right airpod

	    // Body
	    c.setColor (new Color (238, 238, 238)); // white
	    c.fillRect (108, 370, 8, 70);
	    c.setColor (new Color (217, 217, 217)); // light grey outline
	    c.drawRect (108, 370, 8, 70);

	    // Oval part which goes into ear
	    c.setColor (new Color (238, 238, 238)); // white
	    c.fillOval (103, 360, 42, 32);
	    c.setColor (new Color (217, 217, 217)); // light grey outline
	    c.drawOval (103, 360, 42, 32);

	    // Speaker oval
	    c.setColor (new Color (102, 102, 102));
	    c.fillOval (130, 368, 8, 15);

	    // Smaller oval in the middle
	    c.setColor (new Color (153, 153, 153));
	    c.fillOval (115, 374, 8, 3);

	    // Bottom grey bit
	    c.fillRect (108, 437, 8, 3);


	    // Item 4: Audio Technica AT752 Microphone

	    // Green rectangle background behind item
	    c.setColor (new Color (0, 255, 1));
	    c.fillRect (185, 310, 145, 170);

	    // Yellow circle with "3" written in it
	    c.fillOval (178, 304, 30, 30);

	    // White outline of circle
	    c.setColor (Color.black);
	    c.drawOval (178, 304, 30, 30);

	    // "3"
	    c.setFont (f3);
	    c.drawString ("4", 189, 325);

	    // Picture of the item

	    // Mic body

	    // Dark grey handle
	    int xpointsMBody[] = {263, 282, 247, 230};
	    int ypointsMBody[] = {372, 380, 440, 430};
	    c.setColor (new Color (67, 67, 67));
	    c.fillPolygon (xpointsMBody, ypointsMBody, 4);

	    // Bottom light grey bit
	    int xpointsMBottom[] = {247, 230, 227, 245};
	    int ypointsMBottom[] = {440, 430, 435, 445};
	    c.setColor (new Color (183, 183, 183));
	    c.fillPolygon (xpointsMBottom, ypointsMBottom, 4);

	    // Mic ball
	    c.setColor (new Color (183, 183, 183));
	    c.fillOval (260, 360, 30, 30);

	    // Information message
	    c.setColor (new Color (67, 67, 67));
	    c.fillRect (360, 200, 260, 200);

	    // "i" in circle
	    c.setColor (Color.white);
	    c.drawOval (370, 210, 25, 25);
	    c.setFont (f3);
	    c.drawString ("i", 381, 229);

	    // "INFORMATION"
	    c.setFont (Title);
	    c.drawString ("INFORMATION", 410, 230);

	    // Line beneath "INFORMATION"
	    c.drawLine (410, 238, 600, 238);

	    // Information message
	    Font InfoText = new Font ("Arial", Font.PLAIN, 12);
	    c.setFont (InfoText);
	    c.drawString ("Take a closer look at each of our ", 410, 258);
	    c.drawString ("items by entering their numbers.", 410, 274);
	    c.drawString ("When you're done adding items to", 410, 290);
	    c.drawString ("the cart, proceed to the checkout", 410, 306);
	    c.drawString ("by entering '5'.", 410, 322);
	    Font InfoExample = new Font ("Arial", Font.PLAIN, 11);
	    c.setFont (InfoExample);
	    c.drawString ("For example, enter '2' to learn", 410, 350);
	    c.drawString ("about the Sony radio. In the page", 410, 362);
	    c.drawString ("for that item, you will be able to", 410, 374);
	    c.drawString ("add it to your cart if you wish to.", 410, 386);

	    // Checkout button
	    c.setColor (new Color (254, 0, 0));
	    c.fillRoundRect (430, 70, 190, 45, 50, 50);

	    // "Checkout" text
	    c.setFont (Title);
	    c.setColor (Color.white);
	    c.drawString ("Checkout", 500, 100);

	    // Shopping cart

	    // Wheels
	    c.setColor (Color.white);
	    c.fillOval (462, 100, 8, 8);
	    c.fillOval (480, 100, 8, 8);

	    // Body
	    int xpointsCartBody[] = {466, 483, 489, 460};
	    int ypointsCartBody[] = {102, 102, 87, 87};
	    c.fillPolygon (xpointsCartBody, ypointsCartBody, 4);

	    // Handle
	    int xpointsHandle1[] = {460, 464, 460, 456};
	    int ypointsHandle1[] = {87, 87, 81, 81};
	    c.fillPolygon (xpointsHandle1, ypointsHandle1, 4);
	    c.fillRect (452, 81, 7, 2);

	    // "5"
	    c.setFont (InfoText);
	    c.setColor (new Color (67, 67, 67));
	    c.drawString ("5", 471, 98);

	    // Response
	    do
	    {
		response = c.getChar ();
	    }
	    while ((response != '1') && (response != '2') && (response != '3') && (response != '4') && (response != '5'));

	    /* --- PAGE FOR ITEM 1: COWIN B9 BLUETOOTH HEADPHONES --- */

	    if (response == '1')
	    {
		// Pink background
		c.setColor (new Color (224, 102, 101));
		c.fillRect (0, 0, 2000, 2000);

		// Top grey bar
		c.setColor (new Color (67, 67, 67));
		c.fillRect (0, 0, 2000, 60);

		// "sbay"
		c.setFont (f);
		c.setColor (new Color (254, 0, 0)); // red
		c.drawString ("s", 15, 40);
		c.setColor (new Color (74, 134, 232)); // blue
		c.drawString ("b", 30, 40);
		c.setColor (new Color (255, 255, 1)); // yellow
		c.drawString ("a", 51, 40);
		c.setColor (new Color (0, 255, 1)); // green
		c.drawString ("y", 68, 40);

		// Line between "sbay" and "Est. 2018"
		c.setColor (Color.white);
		c.fillRect (100, 13, 2, 35);

		// Est. 2018
		c.setFont (f2);
		c.drawString ("Est. 2018", 120, 39);

		// 24/7 Help-desk: 1-800-111-SBAY
		c.setFont (f3);
		c.drawString ("24/7 Help-desk: 1-800-111-SBAY", 353, 39);

		// Red rectangle background behind item
		c.setColor (new Color (254, 0, 0));
		c.fillRect (20, 120, 240, 260);

		// Title
		c.setColor (Color.white);
		Font ItemTitle = new Font ("Candara", Font.BOLD, 20);
		c.setFont (ItemTitle);
		c.drawString ("COWIN B9 BLUETOOTH HEADPHONES", 20, 100);

		// Picture of the item

		// Top arc of headphone
		c.setColor (new Color (67, 67, 67)); // grey
		c.fillArc (71, 160, 126, 120, 0, 180);
		c.setColor (new Color (254, 0, 0));  // red arc to fill in unnwanted grey part
		c.fillArc (81, 170, 105, 105, 0, 180);

		// Left bar (viewed from front)
		c.setColor (new Color (67, 67, 67)); // grey
		c.fillRect (72, 210, 11, 50);

		// Left cushion
		c.setColor (Color.black); // fill
		c.fillOval (50, 250, 55, 55); // cushion
		c.setColor (new Color (67, 67, 67)); // outline
		c.drawOval (50, 250, 54, 54);

		// Grey inner bit
		c.setColor (new Color (67, 67, 67)); // grey
		c.fillOval (70, 269, 17, 17);

		// Right bar (viewed from front)
		c.setColor (new Color (67, 67, 67)); // grey
		c.fillRect (186, 210, 11, 70);

		// Right cushion
		c.setColor (Color.black); // fill
		c.fillOval (157, 270, 67, 67); // shell
		c.fillOval (150, 269, 65, 65); // cushion
		c.setColor (new Color (67, 67, 67)); // outline
		c.drawOval (157, 270, 66, 66);

		// White line in middle
		c.setColor (Color.white);
		c.drawLine (290, 130, 290, 370);

		// Text

		// Manufacturer & Seller
		Font ArialPlain14 = new Font ("Arial", Font.PLAIN, 14);
		c.setFont (ArialPlain14);
		c.setColor (new Color (67, 67, 67)); // grey
		c.drawString ("Sold by", 310, 155);
		Font ArialBold14 = new Font ("Arial", Font.BOLD, 14);
		c.setFont (ArialBold14);
		c.drawString ("COWIN", 360, 155);

		// Rating
		Font RatingNumber = new Font ("Arial", Font.BOLD, 16);
		c.setFont (RatingNumber);
		c.setColor (new Color (255, 217, 102));
		c.drawString ("4.3/5", 310, 180);
		Font RatingMessage = new Font ("Arial", Font.PLAIN, 15);
		c.setFont (RatingMessage);
		c.drawString ("- Based on customer reviews", 349, 179);

		// Description
		Font Description = new Font ("Arial", Font.PLAIN, 12);
		c.setFont (Description);
		c.setColor (Color.white);
		c.drawString ("The perfect pair for travel, work, and TV/computer use.", 310, 205);
		c.drawString ("Noise cancelling perfected for your everyday life - from", 310, 217);
		c.drawString ("quelling out a busy office, to suppressing subway noise.", 310, 229);
		c.drawString ("30 hours of playing time will keep you hooked to your jams", 310, 241);
		c.drawString ("from dawn to dusk.", 310, 253);

		// Features
		c.drawString ("Features:", 310, 277);
		c.drawString ("• Can be used wirelessly through Bluetooth, or with a wire", 310, 289);
		c.drawString ("• Crisp, powerful sound", 310, 301);
		c.drawString ("• Luxuriously soft ear cushions", 310, 313);

		// Price
		Font Price = new Font ("Arial", Font.BOLD, 16);
		c.setFont (Price);
		c.setColor (new Color (67, 67, 67)); // grey
		c.drawString ("Price: $78.99 (CAD)", 310, 340);

		// "In stock"
		c.setColor (new Color (140, 240, 89));
		c.setFont (ArialBold14);
		c.drawString ("In stock.", 310, 355);

		// "Need more than 1? Increase the quantity at checkout."
		c.setFont (ArialPlain14);
		c.setColor (Color.white);
		c.drawString ("Need more than 1? Increase the quantity at checkout.", 287, 455);

		// Return to Inventory button
		c.setColor (new Color (254, 0, 0));
		c.fillRoundRect (400, 70, 230, 50, 50, 50);

		// "Return to Inventory" text
		Font Return = new Font ("Century Gothic", Font.BOLD, 16);
		c.setFont (Return);
		c.setColor (Color.white);
		c.drawString ("Return to Inventory", 465, 100);

		// "R" in white circle
		c.drawOval (420, 77, 33, 33);
		Font R = new Font ("Century Gothic", Font.BOLD, 20);
		c.setFont (R);
		c.drawString ("R", 431, 101);

		// The following loop is for the purpose of alternating between an "Add to Cart" button and a
		// "Remove from Cart" button. The reason for this being is if the user adds the item to their cart
		// and changes their mind, they have the option of removing it. If they remove it and change their
		// mind again, they can add it back. When they've finally made a decision, they can return to Inventory.

		do
		{
		    // The following code displays the Add to Cart button. When the user sees it, they have the option of adding the given item
		    // to their cart (by pressing 'Y'), or returning to the inventory (by pressing 'R').

		    if (headphone == 0) // this variable was initialized with a value of '0' so this will be true the first time
		    {
			// Add to cart button
			c.setColor (new Color (255, 217, 102)); // button fill
			c.fillRect (330, 390, 250, 45);
			c.setColor (new Color (67, 67, 67)); // button outline
			c.drawRect (330, 390, 249, 44);

			// "Add to cart" text
			Font AddtoCart = new Font ("Arial", Font.PLAIN, 20);
			c.setFont (AddtoCart);
			c.drawString ("ADD TO CART", 410, 420);

			// Circle with "Y" in it
			c.drawOval (350, 397, 30, 30);
			c.drawOval (350, 397, 30, 30);
			Font Y = new Font ("Century Gothic", Font.BOLD, 20);
			c.setFont (Y);
			c.drawString ("Y", 360, 420);

			// Pink rectangle that will cover up a message that will come later. It is simply necessary because this is looped.
			// If you have trouble understanding what this is for, simply set the colour below to black or any other colour and you will see why.
			c.setColor (new Color (224, 102, 101));
			c.fillRect (280, 442, 350, 60);

			// "Need more than 1? Increase the quantity at checkout."
			c.setFont (ArialPlain14);
			c.setColor (Color.white);
			c.drawString ("Need more than 1? Increase the quantity at checkout.", 287, 455);

			// This is where the user inputs their response (either 'Y' or 'R')
			do
			{
			    addOrReturn1 = c.getChar ();

			    // The loop checks the character inputted until 'Y' or 'R' is entered.
			    // This loop is necessary to ensure if the user enters a character other than 'Y' or 'R', the program
			    // does not break.
			}
			while ((addOrReturn1 != 'Y') && (addOrReturn1 != 'y') && (addOrReturn1 != 'R') && (addOrReturn1 != 'r'));

			// If the user entered 'Y' to add the item to their cart, the program takes that into account here so it can make the required calculations at the end.
			if ((addOrReturn1 == 'Y') || (addOrReturn1 == 'y'))
			{
			    headphone = 1; // a value of 1 is stored in this variable so the program knows the user added it to their cart
			    totalItems++; // the program adds 1 to this variable to count the total number of *different* items added to cart
			}
			else
			    removeOrReturn1 = 'R'; // if the user entered 'R', we must give this other variable a value of 'R' too or the loop won't terminate
		    }

		    // The program will display a "Remove from cart" button so the user knows they have that option now if they changed their mind.
		    // At this point they are also able to Return to Inventory.
		    if ((headphone == 1) && (addOrReturn1 != 'R') && (addOrReturn1 != 'r'))
		    {
			// Remove from cart button
			c.setColor (new Color (254, 0, 0)); // button fill
			c.fillRect (330, 390, 250, 45);
			c.setColor (new Color (67, 67, 67)); // button outline
			c.drawRect (330, 390, 249, 44);

			// "Remove from cart" text
			Font RemoveFromCart = new Font ("Arial", Font.BOLD, 16);
			c.setFont (RemoveFromCart);
			c.setColor (Color.white);
			c.drawString ("REMOVE FROM CART", 395, 418);

			// Circle with "X" in it
			c.drawOval (350, 397, 30, 30);
			c.drawOval (350, 397, 30, 30);
			Font Y = new Font ("Century Gothic", Font.BOLD, 20);
			c.setFont (Y);
			c.drawString ("X", 359, 420);

			// Pink rectangle to cover up existing "need more" text
			c.setColor (new Color (224, 102, 101));
			c.fillRect (280, 442, 350, 60);

			Font ArialPlain12 = new Font ("Arial", Font.PLAIN, 13);
			c.setFont (ArialPlain12);
			c.setColor (Color.white);
			c.drawString ("This item has been added to your cart. Once again,", 312, 455);
			c.drawString ("you may increase the quantity at checkout. If you've", 311, 470);
			c.drawString ("changed your mind, you should remove it now.", 325, 485);

			// This is where the user inputs their response (either 'X' or 'R')
			do
			{
			    removeOrReturn1 = c.getChar ();

			    // The loop checks the character inputted until 'X' or 'R' is entered.
			    // This loop is necessary to ensure if the user enters a character other than 'X' or 'R', the program
			    // does not break.
			}
			while ((removeOrReturn1 != 'X') && (removeOrReturn1 != 'x') && (removeOrReturn1 != 'R') && (removeOrReturn1 != 'r'));

			if ((removeOrReturn1 == 'X') || (removeOrReturn1 == 'x')) // if the user wants to remove the item from their cart...
			{
			    headphone = 0; // a value of 0 is stored in this variable so the program knows the user removed it from their cart
			    totalItems--; // the program subtracts 1 from this variable so it knows the total *different* items purchased
			}
		    }
		}
		while (((addOrReturn1 != 'R') || (addOrReturn1 != 'r')) && ((removeOrReturn1 == 'X') || (removeOrReturn1 == 'x')));

		// So long as the user enters 'X' (which is to remove) when they are prompted to
		// either remove their item from the cart or return, the loop will repeat and display
		// the "Add to Cart" button again.
	    }

	    /* --- PAGE FOR ITEM 2: SONY MX42-C AM/FM RADIO --- */
	    else
		if (response == '2')
		{
		    // Pink background
		    c.setColor (new Color (224, 102, 101));
		    c.fillRect (0, 0, 2000, 2000);

		    // Top grey bar
		    c.setColor (new Color (67, 67, 67));
		    c.fillRect (0, 0, 2000, 60);

		    // "sbay"
		    c.setFont (f);
		    c.setColor (new Color (254, 0, 0)); // red
		    c.drawString ("s", 15, 40);
		    c.setColor (new Color (74, 134, 232)); // blue
		    c.drawString ("b", 30, 40);
		    c.setColor (new Color (255, 255, 1)); // yellow
		    c.drawString ("a", 51, 40);
		    c.setColor (new Color (0, 255, 1)); // green
		    c.drawString ("y", 68, 40);

		    // Line between "sbay" and "Est. 2018"
		    c.setColor (Color.white);
		    c.fillRect (100, 13, 2, 35);

		    // Est. 2018
		    c.setFont (f2);
		    c.drawString ("Est. 2018", 120, 39);

		    // 24/7 Help-desk: 1-800-111-SBAY
		    c.setFont (f3);
		    c.drawString ("24/7 Help-desk: 1-800-111-SBAY", 353, 39);

		    // Blue rectangle background behind item
		    c.setColor (new Color (74, 134, 232));
		    c.fillRect (20, 120, 240, 260);

		    // Title
		    c.setColor (Color.white);
		    Font ItemTitle = new Font ("Candara", Font.BOLD, 20);
		    c.setFont (ItemTitle);
		    c.drawString ("SONY MX42-C PORTABLE AM/FM RADIO", 20, 100);


		    // Picture of the item

		    // Radio body
		    c.setColor (new Color (241, 194, 50)); // yellowish orange
		    c.fillRoundRect (48, 210, 190, 85, 15, 15);

		    // Speaker
		    c.setColor (new Color (67, 67, 67)); // grey
		    c.fillOval (67, 230, 50, 50);
		    // There was supposed to be an outline but I removed it because it isn't noticable
		    c.setColor (new Color (37, 37, 37)); // darker grey oval
		    c.fillOval (85, 235, 23, 17);

		    // "Sony"
		    Font Sony2 = new Font ("Times New Roman", Font.PLAIN, 13);
		    c.setFont (Sony2);
		    c.drawString ("Sony", 130, 230);

		    // Antenna
		    c.setColor (new Color (183, 183, 183)); // light grey
		    c.fillRect (75, 170, 5, 40);

		    // Bottom and top grey bars
		    c.setColor (new Color (37, 37, 37));
		    c.fillRect (75, 205, 137, 5); // top
		    c.fillRect (75, 295, 137, 5); // bottom

		    // Volume adjuster
		    c.setColor (new Color (67, 67, 67)); // back grey circle
		    c.fillOval (190, 225, 30, 30);
		    c.setColor (Color.black); // front grey oval (part that is held & twisted)
		    c.fillOval (196, 230, 23, 23);
		    c.setColor (new Color (102, 102, 102)); // light grey notch
		    c.fillRect (207, 231, 3, 6);

		    // "Low" and "High"
		    Font LowHighOnOff = new Font ("Times New Roman", Font.PLAIN, 8);
		    c.setFont (LowHighOnOff);
		    c.setColor (Color.black);
		    c.drawString ("Low", 185, 261);
		    c.drawString ("High", 215, 225);

		    // On & Off slider
		    c.setColor (new Color (67, 67, 67)); // sliding area
		    c.fillRoundRect (185, 275, 25, 10, 5, 5);
		    c.setColor (new Color (37, 37, 37)); // button
		    c.fillRoundRect (195, 275, 14, 10, 5, 5);

		    // "On" and "Off"
		    c.setColor (Color.black);
		    c.drawString ("Off", 170, 283);
		    c.drawString ("On", 212, 283);

		    // White line in middle
		    c.setColor (Color.white);
		    c.drawLine (290, 130, 290, 370);

		    // Text

		    // Manufacturer & Seller
		    Font ArialPlain14 = new Font ("Arial", Font.PLAIN, 14);
		    c.setFont (ArialPlain14);
		    c.setColor (new Color (67, 67, 67)); // grey
		    c.drawString ("Sold by", 310, 155);
		    Font ArialBold14 = new Font ("Arial", Font.BOLD, 14);
		    c.setFont (ArialBold14);
		    c.drawString ("SONY", 360, 155);

		    // Rating
		    Font RatingNumber = new Font ("Arial", Font.BOLD, 16);
		    c.setFont (RatingNumber);
		    c.setColor (new Color (255, 217, 102));
		    c.drawString ("4.7/5", 310, 180);
		    Font RatingMessage = new Font ("Arial", Font.PLAIN, 15);
		    c.setFont (RatingMessage);
		    c.drawString ("- Based on customer reviews", 349, 179);

		    // Description
		    Font Description = new Font ("Arial", Font.PLAIN, 12);
		    c.setFont (Description);
		    c.setColor (Color.white);
		    c.drawString ("First made in 1992 in a Canadian Sony branch, this", 310, 205);
		    c.drawString ("affordable portable AM/FM radio became a bestseller", 310, 217);
		    c.drawString ("across North America. Today, it remains one of Sony's", 310, 229);
		    c.drawString ("best ever radios, surpassing the standards of even 2018.", 310, 241);

		    // Features
		    c.drawString ("Features:", 310, 277);
		    c.drawString ("• AM/FM Radio, Skip Search Function", 310, 289);
		    c.drawString ("• CD-R compatible CD player", 310, 301);
		    c.drawString ("• Headphone jack", 310, 313);

		    // Price
		    Font Price = new Font ("Arial", Font.BOLD, 16);
		    c.setFont (Price);
		    c.setColor (new Color (67, 67, 67)); // grey
		    c.drawString ("Price: $18.99 (CAD)", 310, 340);

		    // "In stock"
		    c.setColor (new Color (140, 240, 89));
		    c.setFont (ArialBold14);
		    c.drawString ("In stock.", 310, 355);

		    // "Need more than 1? Increase the quantity at checkout."
		    c.setFont (ArialPlain14);
		    c.setColor (Color.white);
		    c.drawString ("Need more than 1? Increase the quantity at checkout.", 287, 455);

		    // Return to Inventory button
		    c.setColor (new Color (254, 0, 0));
		    c.fillRoundRect (400, 70, 230, 50, 50, 50);

		    // "Return to Inventory" text
		    Font Return = new Font ("Century Gothic", Font.BOLD, 16);
		    c.setFont (Return);
		    c.setColor (Color.white);
		    c.drawString ("Return to Inventory", 465, 100);

		    // "R" in white circle
		    c.drawOval (420, 77, 33, 33);
		    Font R = new Font ("Century Gothic", Font.BOLD, 20);
		    c.setFont (R);
		    c.drawString ("R", 431, 101);

		    // The following loop is for the purpose of alternating between an "Add to Cart" button and a
		    // "Remove from Cart" button. The reason for this being is if the user adds the item to their cart
		    // and changes their mind, they have the option of removing it. If they remove it and change their
		    // mind again, they can add it back. When they've finally made a decision, they can return to Inventory.

		    do
		    {
			// The following code displays the Add to Cart button. When the user sees it, they have the option of adding the given item
			// to their cart (by pressing 'Y'), or returning to the inventory (by pressing 'R').

			if (radio == 0) // this variable was initialized with a value of '0' so this will be true the first time
			{
			    // Add to cart button
			    c.setColor (new Color (255, 217, 102)); // button fill
			    c.fillRect (330, 390, 250, 45);
			    c.setColor (new Color (67, 67, 67)); // button outline
			    c.drawRect (330, 390, 249, 44);

			    // "Add to cart" text
			    Font AddtoCart = new Font ("Arial", Font.PLAIN, 20);
			    c.setFont (AddtoCart);
			    c.drawString ("ADD TO CART", 410, 420);

			    // Circle with "Y" in it
			    c.drawOval (350, 397, 30, 30);
			    c.drawOval (350, 397, 30, 30);
			    Font Y = new Font ("Century Gothic", Font.BOLD, 20);
			    c.setFont (Y);
			    c.drawString ("Y", 360, 420);

			    // Pink rectangle that will cover up a message that will come later. It is simply necessary because this is looped.
			    // If you have trouble understanding what this is for, simply set the colour below to black or any other colour and you will see why.
			    c.setColor (new Color (224, 102, 101));
			    c.fillRect (280, 442, 350, 60);

			    // "Need more than 1? Increase the quantity at checkout."
			    c.setFont (ArialPlain14);
			    c.setColor (Color.white);
			    c.drawString ("Need more than 1? Increase the quantity at checkout.", 287, 455);

			    // This is where the user inputs their response (either 'Y' or 'R')
			    do
			    {
				addOrReturn2 = c.getChar ();

				// The loop checks the character inputted until 'Y' or 'R' is entered.
				// This loop is necessary to ensure if the user enters a character other than 'Y' or 'R', the program
				// does not break.
			    }
			    while ((addOrReturn2 != 'Y') && (addOrReturn2 != 'y') && (addOrReturn2 != 'R') && (addOrReturn2 != 'r'));

			    // If the user entered 'Y' to add the item to their cart, the program takes that into account here so it can make the required calculations at the end.
			    if ((addOrReturn2 == 'Y') || (addOrReturn2 == 'y'))
			    {
				radio = 1; // a value of 1 is stored in this variable so the program knows the user added it to their cart
				totalItems++; // the program adds 1 to this variable to count the total number of *different* items added to cart
			    }
			    else
				removeOrReturn2 = 'R'; // if the user entered 'R', we must give this other variable a value of 'R' too or the loop won't terminate
			}

			// The program will display a "Remove from cart" button so the user knows they have that option now if they changed their mind.
			// At this point they are also able to Return to Inventory.
			if ((radio == 1) && (addOrReturn2 != 'R') && (addOrReturn2 != 'r'))
			{
			    // Remove from cart button
			    c.setColor (new Color (254, 0, 0)); // button fill
			    c.fillRect (330, 390, 250, 45);
			    c.setColor (new Color (67, 67, 67)); // button outline
			    c.drawRect (330, 390, 249, 44);

			    // "Remove from cart" text
			    Font RemoveFromCart = new Font ("Arial", Font.BOLD, 16);
			    c.setFont (RemoveFromCart);
			    c.setColor (Color.white);
			    c.drawString ("REMOVE FROM CART", 395, 418);

			    // Circle with "X" in it
			    c.drawOval (350, 397, 30, 30);
			    c.drawOval (350, 397, 30, 30);
			    Font Y = new Font ("Century Gothic", Font.BOLD, 20);
			    c.setFont (Y);
			    c.drawString ("X", 359, 420);

			    // Pink rectangle to cover up existing "need more" text
			    c.setColor (new Color (224, 102, 101));
			    c.fillRect (280, 442, 350, 60);

			    Font ArialPlain12 = new Font ("Arial", Font.PLAIN, 13);
			    c.setFont (ArialPlain12);
			    c.setColor (Color.white);
			    c.drawString ("This item has been added to your cart. Once again,", 312, 455);
			    c.drawString ("you may increase the quantity at checkout. If you've", 311, 470);
			    c.drawString ("changed your mind, you should remove it now.", 325, 485);

			    // This is where the user inputs their response (either 'X' or 'R')
			    do
			    {
				removeOrReturn2 = c.getChar ();

				// The loop checks the character inputted until 'X' or 'R' is entered.
				// This loop is necessary to ensure if the user enters a character other than 'X' or 'R', the program
				// does not break.
			    }
			    while ((removeOrReturn2 != 'X') && (removeOrReturn2 != 'x') && (removeOrReturn2 != 'R') && (removeOrReturn2 != 'r'));

			    if ((removeOrReturn2 == 'X') || (removeOrReturn2 == 'x')) // if the user wants to remove the item from their cart...
			    {
				radio = 0; // a value of 0 is stored in this variable so the program knows the user removed it from their cart
				totalItems--; // the program subtracts 1 from this variable so it knows the total *different* items purchased
			    }
			}
		    }
		    while (((addOrReturn2 != 'R') || (addOrReturn2 != 'r')) && ((removeOrReturn2 == 'X') || (removeOrReturn2 == 'x')));

		    // So long as the user enters 'X' (which is to remove) when they are prompted to
		    // either remove their item from the cart or return, the loop will repeat and display
		    // the "Add to Cart" button again.
		}

	    /* --- PAGE FOR ITEM 3: APPLE AIRPODS --- */
	    else
		if (response == '3')
		{
		    // Pink background
		    c.setColor (new Color (224, 102, 101));
		    c.fillRect (0, 0, 2000, 2000);

		    // Top grey bar
		    c.setColor (new Color (67, 67, 67));
		    c.fillRect (0, 0, 2000, 60);

		    // "sbay"
		    c.setFont (f);
		    c.setColor (new Color (254, 0, 0)); // red
		    c.drawString ("s", 15, 40);
		    c.setColor (new Color (74, 134, 232)); // blue
		    c.drawString ("b", 30, 40);
		    c.setColor (new Color (255, 255, 1)); // yellow
		    c.drawString ("a", 51, 40);
		    c.setColor (new Color (0, 255, 1)); // green
		    c.drawString ("y", 68, 40);

		    // Line between "sbay" and "Est. 2018"
		    c.setColor (Color.white);
		    c.fillRect (100, 13, 2, 35);

		    // Est. 2018
		    c.setFont (f2);
		    c.drawString ("Est. 2018", 120, 39);

		    // 24/7 Help-desk: 1-800-111-SBAY
		    c.setFont (f3);
		    c.drawString ("24/7 Help-desk: 1-800-111-SBAY", 353, 39);

		    // Yellow rectangle background behind item
		    c.setColor (new Color (255, 255, 1));
		    c.fillRect (20, 120, 240, 260);

		    // Title
		    c.setColor (Color.white);
		    Font ItemTitle = new Font ("Candara", Font.BOLD, 20);
		    c.setFont (ItemTitle);
		    c.drawString ("APPLE AIRPODS", 20, 100);


		    // Picture of the item

		    // Left airpod

		    // Body
		    c.setColor (new Color (238, 238, 238)); // white
		    c.fillRect (100, 200, 13, 120);
		    c.setColor (new Color (217, 217, 217)); // light grey outline
		    c.drawRect (100, 200, 13, 120);

		    // Oval part which goes into ear
		    c.setColor (new Color (238, 238, 238)); // white
		    c.fillOval (50, 180, 70, 50);
		    c.setColor (new Color (217, 217, 217)); // light grey outline
		    c.drawOval (50, 180, 70, 50);

		    // Speaker oval
		    c.setColor (new Color (102, 102, 102));
		    c.fillOval (65, 195, 9, 19);

		    // Smaller oval in the middle
		    c.setColor (new Color (153, 153, 153));
		    c.fillOval (88, 202, 12, 6);

		    // Bottom grey bit
		    c.fillRect (100, 317, 14, 5);

		    // Right airpod

		    // Body
		    c.setColor (new Color (238, 238, 238)); // white
		    c.fillRect (160, 200, 13, 120);
		    c.setColor (new Color (217, 217, 217)); // light grey outline
		    c.drawRect (160, 200, 13, 120);

		    // Oval part which goes into ear
		    c.setColor (new Color (238, 238, 238)); // white
		    c.fillOval (155, 180, 70, 50);
		    c.setColor (new Color (217, 217, 217)); // light grey outline
		    c.drawOval (155, 180, 70, 50);

		    // Speaker oval
		    c.setColor (new Color (102, 102, 102));
		    c.fillOval (203, 195, 9, 19);

		    // Smaller oval in the middle
		    c.setColor (new Color (153, 153, 153));
		    c.fillOval (178, 202, 12, 6);

		    // Bottom grey bit
		    c.fillRect (160, 317, 14, 5);

		    // White line in middle
		    c.setColor (Color.white);
		    c.drawLine (290, 130, 290, 370);

		    // Text

		    // Manufacturer & Seller
		    Font ArialPlain14 = new Font ("Arial", Font.PLAIN, 14);
		    c.setFont (ArialPlain14);
		    c.setColor (new Color (67, 67, 67)); // grey
		    c.drawString ("Sold by", 310, 155);
		    Font ArialBold14 = new Font ("Arial", Font.BOLD, 14);
		    c.setFont (ArialBold14);
		    c.drawString ("Apple", 360, 155);

		    // Rating
		    Font RatingNumber = new Font ("Arial", Font.BOLD, 16);
		    c.setFont (RatingNumber);
		    c.setColor (new Color (255, 217, 102));
		    c.drawString ("4.8/5", 310, 180);
		    Font RatingMessage = new Font ("Arial", Font.PLAIN, 15);
		    c.setFont (RatingMessage);
		    c.drawString ("- Based on customer reviews", 349, 179);

		    // Description
		    Font Description = new Font ("Arial", Font.PLAIN, 12);
		    c.setFont (Description);
		    c.setColor (Color.white);
		    c.drawString ("A true catalyst that will change the way you listen to", 310, 205);
		    c.drawString ("audio forever. Put it in your ear and it's already on.", 310, 217);
		    c.drawString ("Take it out and it's paused. Siri is only a double-tap away.", 310, 229);
		    c.drawString ("Mesmerize yourself with the high quality sounds of Apple's", 310, 241);
		    c.drawString ("AirPods, matched by no other.", 310, 253);

		    // Features
		    c.drawString ("Features:", 310, 277);
		    c.drawString ("• Automatically on, automatically connected", 310, 289);
		    c.drawString ("• Quick access to Siri", 310, 301);
		    c.drawString ("• Rich, high quality audio", 310, 313);

		    // Price
		    Font Price = new Font ("Arial", Font.BOLD, 16);
		    c.setFont (Price);
		    c.setColor (new Color (67, 67, 67)); // grey
		    c.drawString ("Price: $219.99 (CAD)", 310, 340);

		    // "In stock"
		    c.setColor (new Color (140, 240, 89));
		    c.setFont (ArialBold14);
		    c.drawString ("In stock.", 310, 355);

		    // "Need more than 1? Increase the quantity at checkout."
		    c.setFont (ArialPlain14);
		    c.setColor (Color.white);
		    c.drawString ("Need more than 1? Increase the quantity at checkout.", 287, 455);

		    // Return to Inventory button
		    c.setColor (new Color (254, 0, 0));
		    c.fillRoundRect (400, 70, 230, 50, 50, 50);

		    // "Return to Inventory" text
		    Font Return = new Font ("Century Gothic", Font.BOLD, 16);
		    c.setFont (Return);
		    c.setColor (Color.white);
		    c.drawString ("Return to Inventory", 465, 100);

		    // "R" in white circle
		    c.drawOval (420, 77, 33, 33);
		    Font R = new Font ("Century Gothic", Font.BOLD, 20);
		    c.setFont (R);
		    c.drawString ("R", 431, 101);

		    // The following loop is for the purpose of alternating between an "Add to Cart" button and a
		    // "Remove from Cart" button. The reason for this being is if the user adds the item to their cart
		    // and changes their mind, they have the option of removing it. If they remove it and change their
		    // mind again, they can add it back. When they've finally made a decision, they can return to Inventory.

		    do
		    {
			// The following code displays the Add to Cart button. When the user sees it, they have the option of adding the given item
			// to their cart (by pressing 'Y'), or returning to the inventory (by pressing 'R').

			if (earphone == 0) // this variable was initialized with a value of '0' so this will be true the first time
			{
			    // Add to cart button
			    c.setColor (new Color (255, 217, 102)); // button fill
			    c.fillRect (330, 390, 250, 45);
			    c.setColor (new Color (67, 67, 67)); // button outline
			    c.drawRect (330, 390, 249, 44);

			    // "Add to cart" text
			    Font AddtoCart = new Font ("Arial", Font.PLAIN, 20);
			    c.setFont (AddtoCart);
			    c.drawString ("ADD TO CART", 410, 420);

			    // Circle with "Y" in it
			    c.drawOval (350, 397, 30, 30);
			    c.drawOval (350, 397, 30, 30);
			    Font Y = new Font ("Century Gothic", Font.BOLD, 20);
			    c.setFont (Y);
			    c.drawString ("Y", 360, 420);

			    // Pink rectangle that will cover up a message that will come later. It is simply necessary because this is looped.
			    // If you have trouble understanding what this is for, simply set the colour below to black or any other colour and you will see why.
			    c.setColor (new Color (224, 102, 101));
			    c.fillRect (280, 442, 350, 60);

			    // "Need more than 1? Increase the quantity at checkout."
			    c.setFont (ArialPlain14);
			    c.setColor (Color.white);
			    c.drawString ("Need more than 1? Increase the quantity at checkout.", 287, 455);

			    // This is where the user inputs their response (either 'Y' or 'R')
			    do
			    {
				addOrReturn3 = c.getChar ();

				// The loop checks the character inputted until 'Y' or 'R' is entered.
				// This loop is necessary to ensure if the user enters a character other than 'Y' or 'R', the program
				// does not break.
			    }
			    while ((addOrReturn3 != 'Y') && (addOrReturn3 != 'y') && (addOrReturn3 != 'R') && (addOrReturn3 != 'r'));

			    // If the user entered 'Y' to add the item to their cart, the program takes that into account here so it can make the required calculations at the end.
			    if ((addOrReturn3 == 'Y') || (addOrReturn3 == 'y'))
			    {
				earphone = 1; // a value of 1 is stored in this variable so the program knows the user added it to their cart
				totalItems++; // the program adds 1 to this variable to count the total number of *different* items added to cart
			    }
			    else
				removeOrReturn3 = 'R'; // if the user entered 'R', we must give this other variable a value of 'R' too or the loop won't terminate
			}

			// The program will display a "Remove from cart" button so the user knows they have that option now if they changed their mind.
			// At this point they are also able to Return to Inventory.
			if ((earphone == 1) && (addOrReturn3 != 'R') && (addOrReturn3 != 'r'))
			{
			    // Remove from cart button
			    c.setColor (new Color (254, 0, 0)); // button fill
			    c.fillRect (330, 390, 250, 45);
			    c.setColor (new Color (67, 67, 67)); // button outline
			    c.drawRect (330, 390, 249, 44);

			    // "Remove from cart" text
			    Font RemoveFromCart = new Font ("Arial", Font.BOLD, 16);
			    c.setFont (RemoveFromCart);
			    c.setColor (Color.white);
			    c.drawString ("REMOVE FROM CART", 395, 418);

			    // Circle with "X" in it
			    c.drawOval (350, 397, 30, 30);
			    c.drawOval (350, 397, 30, 30);
			    Font Y = new Font ("Century Gothic", Font.BOLD, 20);
			    c.setFont (Y);
			    c.drawString ("X", 359, 420);

			    // Pink rectangle to cover up existing "need more" text
			    c.setColor (new Color (224, 102, 101));
			    c.fillRect (280, 442, 350, 60);

			    Font ArialPlain12 = new Font ("Arial", Font.PLAIN, 13);
			    c.setFont (ArialPlain12);
			    c.setColor (Color.white);
			    c.drawString ("This item has been added to your cart. Once again,", 312, 455);
			    c.drawString ("you may increase the quantity at checkout. If you've", 311, 470);
			    c.drawString ("changed your mind, you should remove it now.", 325, 485);

			    // This is where the user inputs their response (either 'X' or 'R')
			    do
			    {
				removeOrReturn3 = c.getChar ();

				// The loop checks the character inputted until 'X' or 'R' is entered.
				// This loop is necessary to ensure if the user enters a character other than 'X' or 'R', the program
				// does not break.
			    }
			    while ((removeOrReturn3 != 'X') && (removeOrReturn3 != 'x') && (removeOrReturn3 != 'R') && (removeOrReturn3 != 'r'));

			    if ((removeOrReturn3 == 'X') || (removeOrReturn3 == 'x')) // if the user wants to remove the item from their cart...
			    {
				earphone = 0; // a value of 0 is stored in this variable so the program knows the user removed it from their cart
				totalItems--; // the program subtracts 1 from this variable so it knows the total *different* items purchased
			    }
			}
		    }
		    while (((addOrReturn3 != 'R') || (addOrReturn3 != 'r')) && ((removeOrReturn3 == 'X') || (removeOrReturn3 == 'x')));

		    // So long as the user enters 'X' (which is to remove) when they are prompted to
		    // either remove their item from the cart or return, the loop will repeat and display
		    // the "Add to Cart" button again.
		}
	    /* PAGE FOR ITEM 4: AUDIO TECHNICA AT752 MIC */
	    else
		if (response == '4')
		{
		    // Pink background
		    c.setColor (new Color (224, 102, 101));
		    c.fillRect (0, 0, 2000, 2000);

		    // Top grey bar
		    c.setColor (new Color (67, 67, 67));
		    c.fillRect (0, 0, 2000, 60);

		    // "sbay"
		    c.setFont (f);
		    c.setColor (new Color (254, 0, 0)); // red
		    c.drawString ("s", 15, 40);
		    c.setColor (new Color (74, 134, 232)); // blue
		    c.drawString ("b", 30, 40);
		    c.setColor (new Color (255, 255, 1)); // yellow
		    c.drawString ("a", 51, 40);
		    c.setColor (new Color (0, 255, 1)); // green
		    c.drawString ("y", 68, 40);

		    // Line between "sbay" and "Est. 2018"
		    c.setColor (Color.white);
		    c.fillRect (100, 13, 2, 35);

		    // Est. 2018
		    c.setFont (f2);
		    c.drawString ("Est. 2018", 120, 39);

		    // 24/7 Help-desk: 1-800-111-SBAY
		    c.setFont (f3);
		    c.drawString ("24/7 Help-desk: 1-800-111-SBAY", 353, 39);

		    // Green rectangle background behind item
		    c.setColor (new Color (0, 255, 1));
		    c.fillRect (20, 120, 240, 260);

		    // Title
		    c.setColor (Color.white);
		    Font ItemTitle = new Font ("Candara", Font.BOLD, 20);
		    c.setFont (ItemTitle);
		    c.drawString ("AUDIO TECHNICA AT752 MIC", 20, 100);

		    // Picture of the item

		    // Mic body

		    // Dark grey handle
		    int xpointsMBody2[] = {140, 165, 110, 85};
		    int ypointsMBody2[] = {220, 235, 340, 325};
		    c.setColor (new Color (67, 67, 67));
		    c.fillPolygon (xpointsMBody2, ypointsMBody2, 4);

		    /* Dark grey top curvy part
		    int xpointsMCurve[] = {130, 150, 180, 135};
		    int ypointsMCurve[] = {240, 265, 220, 210};
		    c.fillPolygon (xpointsMCurve, ypointsMCurve, 4); */

		    // Bottom light grey bit
		    int xpointsMBottom2[] = {84, 113, 109, 80};
		    int ypointsMBottom2[] = {323, 340, 347, 330};
		    c.setColor (new Color (183, 183, 183));
		    c.fillPolygon (xpointsMBottom2, ypointsMBottom2, 4);

		    // Mic ball
		    c.setColor (new Color (183, 183, 183)); // ball color
		    c.fillOval (135, 195, 45, 45);

		    // Light line on the mic ball's middle
		    c.setColor (new Color (217, 217, 217)); // light grey
		    int xpointsMLine[] = {140, 180, 176, 136};
		    int ypointsMLine[] = {203, 223, 228, 208};
		    c.fillPolygon (xpointsMLine, ypointsMLine, 4);

		    // Button

		    // Back of button
		    c.setColor (new Color (33, 33, 33)); // black
		    int xpointsMButtonBack[] = {127, 140, 129, 117};
		    int ypointsMButtonBack[] = {260, 267, 287, 280};
		    c.fillPolygon (xpointsMButtonBack, ypointsMButtonBack, 4);

		    // Button itself
		    c.setColor (new Color (102, 102, 102)); // light grey
		    int xpointsMButton[] = {127, 140, 133, 120};
		    int ypointsMButton[] = {260, 267, 281, 274};
		    c.fillPolygon (xpointsMButton, ypointsMButton, 4);


		    // White line in middle
		    c.setColor (Color.white);
		    c.drawLine (290, 130, 290, 370);

		    // Text

		    // Manufacturer & Seller
		    Font ArialPlain14 = new Font ("Arial", Font.PLAIN, 14);
		    c.setFont (ArialPlain14);
		    c.setColor (new Color (67, 67, 67)); // grey
		    c.drawString ("Sold by", 310, 155);
		    Font ArialBold14 = new Font ("Arial", Font.BOLD, 14);
		    c.setFont (ArialBold14);
		    c.drawString ("Audio-Technica", 360, 155);

		    // Rating
		    Font RatingNumber = new Font ("Arial", Font.BOLD, 16);
		    c.setFont (RatingNumber);
		    c.setColor (new Color (255, 217, 102));
		    c.drawString ("4.2/5", 310, 180);
		    Font RatingMessage = new Font ("Arial", Font.PLAIN, 15);
		    c.setFont (RatingMessage);
		    c.drawString ("- Based on customer reviews", 349, 179);

		    // Description
		    Font Description = new Font ("Arial", Font.PLAIN, 12);
		    c.setFont (Description);
		    c.setColor (Color.white);
		    c.drawString ("Ideal for home studios. Exceeding standards for its price.", 310, 205);
		    c.drawString ("A perfect gift and a perfect microphone for everyone,", 310, 217);
		    c.drawString ("whether you're a professional content creator or someone", 310, 229);
		    c.drawString ("who simply needs a mic to talk with friends and family.", 310, 241);

		    // Features
		    c.drawString ("Features:", 310, 277);
		    c.drawString ("• High quality audio capture", 310, 289);
		    c.drawString ("• Rich design and texture", 310, 301);
		    c.drawString ("• Can be used wirelessly or with a wire", 310, 313);

		    // Price
		    Font Price = new Font ("Arial", Font.BOLD, 16);
		    c.setFont (Price);
		    c.setColor (new Color (67, 67, 67)); // grey
		    c.drawString ("Price: $74.99 (CAD)", 310, 340);

		    // "In stock"
		    c.setColor (new Color (140, 240, 89));
		    c.setFont (ArialBold14);
		    c.drawString ("In stock.", 310, 355);

		    // "Need more than 1? Increase the quantity at checkout."
		    c.setFont (ArialPlain14);
		    c.setColor (Color.white);
		    c.drawString ("Need more than 1? Increase the quantity at checkout.", 287, 455);

		    // Return to Inventory button
		    c.setColor (new Color (254, 0, 0));
		    c.fillRoundRect (400, 70, 230, 50, 50, 50);

		    // "Return to Inventory" text
		    Font Return = new Font ("Century Gothic", Font.BOLD, 16);
		    c.setFont (Return);
		    c.setColor (Color.white);
		    c.drawString ("Return to Inventory", 465, 100);

		    // "R" in white circle
		    c.drawOval (420, 77, 33, 33);
		    Font R = new Font ("Century Gothic", Font.BOLD, 20);
		    c.setFont (R);
		    c.drawString ("R", 431, 101);

		    // The following loop is for the purpose of alternating between an "Add to Cart" button and a
		    // "Remove from Cart" button. The reason for this being is if the user adds the item to their cart
		    // and changes their mind, they have the option of removing it. If they remove it and change their
		    // mind again, they can add it back. When they've finally made a decision, they can return to Inventory.

		    do
		    {
			// The following code displays the Add to Cart button. When the user sees it, they have the option of adding the given item
			// to their cart (by pressing 'Y'), or returning to the inventory (by pressing 'R').

			if (microphone == 0) // this variable was initialized with a value of '0' so this will be true the first time
			{
			    // Add to cart button
			    c.setColor (new Color (255, 217, 102)); // button fill
			    c.fillRect (330, 390, 250, 45);
			    c.setColor (new Color (67, 67, 67)); // button outline
			    c.drawRect (330, 390, 249, 44);

			    // "Add to cart" text
			    Font AddtoCart = new Font ("Arial", Font.PLAIN, 20);
			    c.setFont (AddtoCart);
			    c.drawString ("ADD TO CART", 410, 420);

			    // Circle with "Y" in it
			    c.drawOval (350, 397, 30, 30);
			    c.drawOval (350, 397, 30, 30);
			    Font Y = new Font ("Century Gothic", Font.BOLD, 20);
			    c.setFont (Y);
			    c.drawString ("Y", 360, 420);

			    // Pink rectangle that will cover up a message that will come later. It is simply necessary because this is looped.
			    // If you have trouble understanding what this is for, simply set the colour below to black or any other colour and you will see why.
			    c.setColor (new Color (224, 102, 101));
			    c.fillRect (280, 442, 350, 60);

			    // "Need more than 1? Increase the quantity at checkout."
			    c.setFont (ArialPlain14);
			    c.setColor (Color.white);
			    c.drawString ("Need more than 1? Increase the quantity at checkout.", 287, 455);

			    // This is where the user inputs their response (either 'Y' or 'R')
			    do
			    {
				addOrReturn4 = c.getChar ();

				// The loop checks the character inputted until 'Y' or 'R' is entered.
				// This loop is necessary to ensure if the user enters a character other than 'Y' or 'R', the program
				// does not break.
			    }
			    while ((addOrReturn4 != 'Y') && (addOrReturn4 != 'y') && (addOrReturn4 != 'R') && (addOrReturn4 != 'r'));

			    // If the user entered 'Y' to add the item to their cart, the program takes that into account here so it can make the required calculations at the end.
			    if ((addOrReturn4 == 'Y') || (addOrReturn4 == 'y'))
			    {
				microphone = 1; // a value of 1 is stored in this variable so the program knows the user added it to their cart
				totalItems++; // the program adds 1 to this variable to count the total number of *different* items added to cart
			    }
			    else
				removeOrReturn4 = 'R'; // if the user entered 'R', we must give this other variable a value of 'R' too or the loop won't terminate
			}

			// The program will display a "Remove from cart" button so the user knows they have that option now if they changed their mind.
			// At this point they are also able to Return to Inventory.
			if ((microphone == 1) && (addOrReturn4 != 'R') && (addOrReturn4 != 'r'))
			{
			    // Remove from cart button
			    c.setColor (new Color (254, 0, 0)); // button fill
			    c.fillRect (330, 390, 250, 45);
			    c.setColor (new Color (67, 67, 67)); // button outline
			    c.drawRect (330, 390, 249, 44);

			    // "Remove from cart" text
			    Font RemoveFromCart = new Font ("Arial", Font.BOLD, 16);
			    c.setFont (RemoveFromCart);
			    c.setColor (Color.white);
			    c.drawString ("REMOVE FROM CART", 395, 418);

			    // Circle with "X" in it
			    c.drawOval (350, 397, 30, 30);
			    c.drawOval (350, 397, 30, 30);
			    Font Y = new Font ("Century Gothic", Font.BOLD, 20);
			    c.setFont (Y);
			    c.drawString ("X", 359, 420);

			    // Pink rectangle to cover up existing "need more" text
			    c.setColor (new Color (224, 102, 101));
			    c.fillRect (280, 442, 350, 60);

			    Font ArialPlain12 = new Font ("Arial", Font.PLAIN, 13);
			    c.setFont (ArialPlain12);
			    c.setColor (Color.white);
			    c.drawString ("This item has been added to your cart. Once again,", 312, 455);
			    c.drawString ("you may increase the quantity at checkout. If you've", 311, 470);
			    c.drawString ("changed your mind, you should remove it now.", 325, 485);

			    // This is where the user inputs their response (either 'X' or 'R')
			    do
			    {
				removeOrReturn4 = c.getChar ();

				// The loop checks the character inputted until 'X' or 'R' is entered.
				// This loop is necessary to ensure if the user enters a character other than 'X' or 'R', the program
				// does not break.
			    }
			    while ((removeOrReturn4 != 'X') && (removeOrReturn4 != 'x') && (removeOrReturn4 != 'R') && (removeOrReturn4 != 'r'));

			    if ((removeOrReturn4 == 'X') || (removeOrReturn4 == 'x')) // if the user wants to remove the item from their cart...
			    {
				microphone = 0; // a value of 0 is stored in this variable so the program knows the user removed it from their cart
				totalItems--; // the program subtracts 1 from this variable so it knows the total *different* items purchased
			    }
			}
		    }
		    while (((addOrReturn4 != 'R') || (addOrReturn4 != 'r')) && ((removeOrReturn4 == 'X') || (removeOrReturn4 == 'x')));

		    // So long as the user enters 'X' (which is to remove) when they are prompted to
		    // either remove their item from the cart or return, the loop will repeat and display
		    // the "Add to Cart" button again.
		}
		else
		    if (response == '5')
		    {
			finalStep = 'R';
			// Pink background
			c.setColor (new Color (224, 102, 101));
			c.fillRect (0, 0, 2000, 2000);

			// Top grey bar
			c.setColor (new Color (67, 67, 67));
			c.fillRect (0, 0, 2000, 60);

			// "sbay"
			c.setFont (f);
			c.setColor (new Color (254, 0, 0)); // red
			c.drawString ("s", 15, 40);
			c.setColor (new Color (74, 134, 232)); // blue
			c.drawString ("b", 30, 40);
			c.setColor (new Color (255, 255, 1)); // yellow
			c.drawString ("a", 51, 40);
			c.setColor (new Color (0, 255, 1)); // green
			c.drawString ("y", 68, 40);

			// Line between "sbay" and "Est. 2018"
			c.setColor (Color.white);
			c.fillRect (100, 13, 2, 35);

			// Est. 2018
			c.setFont (f2);
			c.drawString ("Est. 2018", 120, 39);

			// 24/7 Help-desk: 1-800-111-SBAY
			c.setFont (f3);
			c.drawString ("24/7 Help-desk: 1-800-111-SBAY", 353, 39);

			// "CHECKOUT"
			c.setColor (Color.white);
			Font Checkout = new Font ("Candara", Font.BOLD, 26);
			c.setFont (Checkout);
			c.drawString ("CHECKOUT", 20, 105);

			// "Review Items"
			Font ReviewItems = new Font ("Candara", Font.BOLD, 16);
			c.setFont (ReviewItems);
			c.drawString ("Review Items", 20, 123);

			// If the user hasn't added anything to their cart, they will be told they didn't through the following statements.
			if ((headphone == 0) && (radio == 0) && (earphone == 0) && (microphone == 0))
			{
			    // Dark grey rectangle
			    c.setColor (new Color (67, 67, 67));
			    c.fillRect (50, 160, 550, 280);

			    // Message
			    c.setColor (Color.white);
			    Font NoItems = new Font ("Candara", Font.BOLD, 50);
			    c.setFont (NoItems);
			    c.drawString ("Your cart is empty.", 140, 230);
			    Font NoItems2 = new Font ("Candara", Font.BOLD, 24);
			    c.setFont (NoItems2);
			    c.drawString ("Add some items to your cart and come back here", 75, 260);
			    c.drawString ("when you're ready to checkout.", 160, 285);

			    // Return to Inventory button
			    c.fillRoundRect (210, 330, 230, 50, 50, 50);

			    // "Return to Inventory" text
			    c.setColor (new Color (67, 67, 67));
			    Font Return = new Font ("Century Gothic", Font.BOLD, 16);
			    c.setFont (Return);
			    c.drawString ("Return to Inventory", 280, 360);

			    // "R" in white circle
			    c.drawOval (229, 338, 33, 33);
			    Font R = new Font ("Century Gothic", Font.BOLD, 20);
			    c.setFont (R);
			    c.drawString ("R", 240, 362);

			    do
			    {
				checkoutReturn = c.getChar ();
				// So long as the user doesn't enter 'R', the program will keep asking for an input.
			    }
			    while ((checkoutReturn != 'R') && (checkoutReturn != 'r'));

			}
			// If the user DOES have items in their cart...
			else
			{
			    do
			    {
				// Pink background
				c.setColor (new Color (224, 102, 101));
				c.fillRect (0, 0, 2000, 2000);

				// Top grey bar
				c.setColor (new Color (67, 67, 67));
				c.fillRect (0, 0, 2000, 60);

				// "sbay"
				c.setFont (f);
				c.setColor (new Color (254, 0, 0)); // red
				c.drawString ("s", 15, 40);
				c.setColor (new Color (74, 134, 232)); // blue
				c.drawString ("b", 30, 40);
				c.setColor (new Color (255, 255, 1)); // yellow
				c.drawString ("a", 51, 40);
				c.setColor (new Color (0, 255, 1)); // green
				c.drawString ("y", 68, 40);

				// Line between "sbay" and "Est. 2018"
				c.setColor (Color.white);
				c.fillRect (100, 13, 2, 35);

				// Est. 2018
				c.setFont (f2);
				c.drawString ("Est. 2018", 120, 39);

				// 24/7 Help-desk: 1-800-111-SBAY
				c.setFont (f3);
				c.drawString ("24/7 Help-desk: 1-800-111-SBAY", 353, 39);

				// "CHECKOUT"
				c.setColor (Color.white);
				c.setFont (Checkout);
				c.drawString ("CHECKOUT", 20, 105);

				// "Review Items"
				c.setFont (ReviewItems);
				c.drawString ("Review Items", 20, 123);

				// Dark grey rectangle behind Order Summary
				c.setColor (new Color (67, 67, 67));
				c.fillRect (400, 80, 225, 390);

				c.setColor (Color.white);

				// "ORDER SUMMARY"
				Font OrderSummary = new Font ("Candara", Font.BOLD, 18);
				c.setFont (OrderSummary);
				c.drawString ("ORDER SUMMARY", 410, 105);

				// "Awaiting quantity inputs..."
				Font CandaraPlain12 = new Font ("Candara", Font.PLAIN, 12);
				c.setFont (CandaraPlain12);
				c.drawString ("Awaiting quantity input(s)...", 410, 125);

				// Colorful Rectangles for items

				// Red rectangle
				c.setColor (new Color (254, 0, 0)); // red
				c.fillRect (20, 140, 360, 75); // rectangle


				// Blue rectangle
				c.setColor (new Color (74, 134, 232)); // blue
				c.fillRect (20, 225, 360, 75); // rectangle


				// Yellow rectangle
				c.setColor (new Color (255, 255, 1)); // yellow
				c.fillRect (20, 310, 360, 75); // rectangle


				// Green rectangle
				c.setColor (new Color (0, 255, 1)); // green
				c.fillRect (20, 395, 360, 75); // rectangle


				Font ArialBold10 = new Font ("Arial", Font.BOLD, 10);
				Font ArialBold11 = new Font ("Arial", Font.BOLD, 11);
				Font CalibriPlain10 = new Font ("Calibri", Font.BOLD, 10);
				Font CandaraBold24 = new Font ("Candara", Font.BOLD, 24);



				// If the user has purchased only one item, the program will check what it is they purchased
				if (totalItems >= 1)
				{

				    c.setColor (Color.white);
				    c.drawOval (35, 161, 30, 30); // circle with '1' in it
				    c.setFont (f3);
				    c.drawString ("1", 45, 183); // "1"
				    c.drawLine (80, 150, 80, 205); // white line

				    // If the only item they purchased is the headphone...
				    if (headphone == 1)
				    {
					// Dark grey rectangle where the price goes
					c.setColor (new Color (67, 67, 67));
					c.fillRect (330, 150, 40, 13);

					// Item name, price, seller
					c.setFont (ArialBold11);
					c.setColor (Color.white);
					c.drawString ("COWIN B9 BLUETOOTH HEADPHONES               $78.99", 95, 160);
					c.setFont (CalibriPlain10);
					c.setColor (new Color (224, 217, 217));
					c.drawString ("Sold by COWIN", 95, 170);

					// Quantity input
					c.setFont (ArialBold11);
					c.setColor (Color.white);
					c.drawString ("Quantity?: ", 95, 195);
					c.setCursor (10, 20);
					c.setTextColor (Color.white);
					c.setTextBackgroundColour (new Color (254, 0, 0));


					headphoneQuantity = c.readInt ();

					if (!(headphoneQuantity > 0))
					{
					    // Dark grey rectangle placed over existing text on order summary
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (400, 140, 225, 330);

					    // Fix for pink part on the left of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (380, 150, 20, 50);

					    // Fix for pink part on the right of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (625, 150, 40, 50);

					    // Grey popup
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (180, 130, 290, 220);

					    // White outline
					    c.setColor (Color.white);
					    c.drawRect (180, 130, 290, 220);

					    // "Error!"
					    c.setFont (CandaraBold24);
					    c.setColor (Color.white);
					    c.drawString ("Error!", 200, 165);

					    // White Line
					    c.drawLine (200, 173, 450, 173);

					    // Error message
					    Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
					    c.setFont (ArialBold11);
					    c.drawString ("You entered an invalid quantity value.", 200, 190);
					    c.drawString ("The value you entered is either:", 200, 201);
					    c.drawString ("1. Negative", 200, 212);
					    c.drawString ("2. Zero", 200, 223);
					    c.drawString ("If you are looking to remove an item from", 200, 245);
					    c.drawString ("the cart or to clear the cart altogether,", 200, 256);
					    c.drawString ("you will be given a chance to do so once you've", 200, 267);
					    c.drawString ("entered a quantity for each item you've added.", 200, 278);
					    c.drawString ("Please enter a quantity which is positive.", 200, 300);

					    // OK button
					    c.fillRect (275, 310, 100, 35);
					    c.setColor (new Color (67, 67, 67));
					    c.drawOval (282, 314, 25, 25);

					    Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
					    c.setFont (CandaraBold20);
					    c.drawString ("Y", 290, 334);
					    Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
					    c.setFont (ArialBold24);
					    c.drawString ("OK", 318, 335);


					    do
					    {
						errorAcknowledge = c.getChar ();
					    }
					    while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

					}
					else
					{
					    errorAcknowledge = 'X';

					    // Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
					    // to the end of the program which is of that colour. The following is a fix for that.

					    // Fix for pink part on the right of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (380, 150, 20, 50);

					    // Fix for pink part on the right of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (625, 150, 40, 50);

					    headphone = 2;

					    // ORDER SUMMARY CALCULATIONS

					    // Dark grey rectangle placed over existing text
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (400, 110, 225, 360);

					    c.setColor (Color.white);
					    c.setFont (ArialBold11);
					    c.drawString ("COWIN B9 BLUETOOTH HEADPHONES", 410, 120);
					    c.drawString ("Base price:                                      $" + headphonePrice, 410, 131);

					    if (headphoneQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
						c.drawString ("Quantity:                                                   " + headphoneQuantity, 410, 142);

					    else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
						c.drawString ("Quantity:                                                 " + headphoneQuantity, 410, 142);

					    headphoneTotal = headphonePrice * headphoneQuantity;
					    c.drawString ("Total:                                               $" + (headphoneTotal), 410, 153);

					    subTotal = subTotal + headphoneTotal; // accumulates subtotal

					    // Covering over extra decimals because we only want 2
					    c.setColor (new Color (67, 67, 67)); // covering grey part
					    c.fillRect (620, 140, 5, 20);
					    c.setColor (new Color (224, 102, 101)); // covering right pink part
					    c.fillRect (625, 140, 50, 300);
					}

				    }
				    else
					if (radio == 1)
					{
					    // Dark grey rectangle where the price goes
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (330, 150, 40, 13);

					    // Item name, price, seller
					    c.setFont (ArialBold11);
					    c.setColor (Color.white);
					    c.drawString ("SONY MX42-C AM/FM PORTABLE RADIO          $18.99", 95, 160);
					    c.setFont (CalibriPlain10);
					    c.setColor (new Color (224, 217, 217));
					    c.drawString ("Sold by SONY", 95, 170);

					    // Quantity input
					    c.setFont (ArialBold11);
					    c.setColor (Color.white);
					    c.drawString ("Quantity?: ", 95, 195);
					    c.setCursor (10, 20);
					    c.setTextColor (Color.white);
					    c.setTextBackgroundColour (new Color (254, 0, 0));

					    radioQuantity = c.readInt ();

					    if (!(radioQuantity > 0))
					    {
						// Dark grey rectangle placed over existing text on order summary
						c.setColor (new Color (67, 67, 67));
						c.fillRect (400, 140, 225, 330);

						// Fix for pink part on the left of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (380, 150, 20, 50);

						// Fix for pink part on the right of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (625, 150, 40, 50);

						// Grey popup
						c.setColor (new Color (67, 67, 67));
						c.fillRect (180, 130, 290, 220);

						// White outline
						c.setColor (Color.white);
						c.drawRect (180, 130, 290, 220);

						// "Error!"
						c.setFont (CandaraBold24);
						c.setColor (Color.white);
						c.drawString ("Error!", 200, 165);

						// White Line
						c.drawLine (200, 173, 450, 173);

						// Error message
						Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
						c.setFont (ArialBold11);
						c.drawString ("You entered an invalid quantity value.", 200, 190);
						c.drawString ("The value you entered is either:", 200, 201);
						c.drawString ("1. Negative", 200, 212);
						c.drawString ("2. Zero", 200, 223);
						c.drawString ("If you are looking to remove an item from", 200, 245);
						c.drawString ("the cart or to clear the cart altogether,", 200, 256);
						c.drawString ("you will be given a chance to do so once you've", 200, 267);
						c.drawString ("entered a quantity for each item you've added.", 200, 278);
						c.drawString ("Please enter a quantity which is positive.", 200, 300);

						// OK button
						c.fillRect (275, 310, 100, 35);
						c.setColor (new Color (67, 67, 67));
						c.drawOval (282, 314, 25, 25);

						Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
						c.setFont (CandaraBold20);
						c.drawString ("Y", 290, 334);
						Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
						c.setFont (ArialBold24);
						c.drawString ("OK", 318, 335);




						do
						{
						    errorAcknowledge = c.getChar ();
						}
						while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

					    }
					    else
					    {
						errorAcknowledge = 'X';

						// Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
						// to the end of the program which is of that colour. The following is a fix for that.

						// Fix for pink part on the right of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (380, 150, 20, 50);

						// Fix for Order Summary dark grey rectangle
						c.setColor (new Color (67, 67, 67));
						c.fillRect (400, 150, 215, 310);

						// Fix for pink part on the right of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (615, 150, 40, 50);

						radio = 2;

						// ORDER SUMMARY CALCULATIONS

						// Dark grey rectangle placed over existing text
						c.setColor (new Color (67, 67, 67));
						c.fillRect (400, 110, 225, 360);

						c.setColor (Color.white);
						c.setFont (ArialBold11);
						c.drawString ("SONY MX42-C AM/FM PORTABLE RADIO", 410, 120);
						c.drawString ("Base price:                                      $" + radioPrice, 410, 131);

						if (radioQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
						    c.drawString ("Quantity:                                                   " + radioQuantity, 410, 142);

						else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
						    c.drawString ("Quantity:                                                 " + radioQuantity, 410, 142);

						radioTotal = radioPrice * radioQuantity;
						c.drawString ("Total:                                               $" + (radioTotal), 410, 153);

						subTotal = subTotal + radioTotal; // accumulates subtotal


						// Covering over extra decimals because we only want 2
						c.setColor (new Color (67, 67, 67)); // covering grey part
						c.fillRect (620, 140, 5, 20);
						c.setColor (new Color (224, 102, 101)); // covering right pink part
						c.fillRect (625, 140, 50, 300);
					    }
					}
					else
					    if (earphone == 1)
					    {
						// Dark grey rectangle where the price goes
						c.setColor (new Color (67, 67, 67));
						c.fillRect (330, 150, 40, 13);

						// Item name, price, seller
						c.setFont (ArialBold11);
						c.setColor (Color.white);
						c.drawString ("APPLE AIRPODS                                                  $219.99", 95, 160);
						c.setFont (CalibriPlain10);
						c.setColor (new Color (224, 217, 217));
						c.drawString ("Sold by Apple", 95, 170);

						// Quantity input
						c.setFont (ArialBold11);
						c.setColor (Color.white);
						c.drawString ("Quantity?: ", 95, 195);
						c.setCursor (10, 20);
						c.setTextColor (Color.white);
						c.setTextBackgroundColour (new Color (254, 0, 0));

						earphoneQuantity = c.readInt ();

						if (!(earphoneQuantity > 0))
						{
						    // Dark grey rectangle placed over existing text on order summary
						    c.setColor (new Color (67, 67, 67));
						    c.fillRect (400, 140, 225, 330);

						    // Fix for pink part on the left of the red rectangle
						    c.setColor (new Color (224, 102, 101));
						    c.fillRect (380, 150, 20, 50);

						    // Fix for pink part on the right of the red rectangle
						    c.setColor (new Color (224, 102, 101));
						    c.fillRect (625, 150, 40, 50);

						    // Grey popup
						    c.setColor (new Color (67, 67, 67));
						    c.fillRect (180, 130, 290, 220);

						    // White outline
						    c.setColor (Color.white);
						    c.drawRect (180, 130, 290, 220);

						    // "Error!"
						    c.setFont (CandaraBold24);
						    c.setColor (Color.white);
						    c.drawString ("Error!", 200, 165);

						    // White Line
						    c.drawLine (200, 173, 450, 173);

						    // Error message
						    Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
						    c.setFont (ArialBold11);
						    c.drawString ("You entered an invalid quantity value.", 200, 190);
						    c.drawString ("The value you entered is either:", 200, 201);
						    c.drawString ("1. Negative", 200, 212);
						    c.drawString ("2. Zero", 200, 223);
						    c.drawString ("If you are looking to remove an item from", 200, 245);
						    c.drawString ("the cart or to clear the cart altogether,", 200, 256);
						    c.drawString ("you will be given a chance to do so once you've", 200, 267);
						    c.drawString ("entered a quantity for each item you've added.", 200, 278);
						    c.drawString ("Please enter a quantity which is positive.", 200, 300);

						    // OK button
						    c.fillRect (275, 310, 100, 35);
						    c.setColor (new Color (67, 67, 67));
						    c.drawOval (282, 314, 25, 25);

						    Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
						    c.setFont (CandaraBold20);
						    c.drawString ("Y", 290, 334);
						    Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
						    c.setFont (ArialBold24);
						    c.drawString ("OK", 318, 335);


						    do
						    {
							errorAcknowledge = c.getChar ();
						    }
						    while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

						}
						else
						{
						    errorAcknowledge = 'X';


						    // Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
						    // to the end of the program which is of that colour. The following is a fix for that.

						    // Fix for pink part on the right of the red rectangle
						    c.setColor (new Color (224, 102, 101));
						    c.fillRect (380, 150, 20, 50);

						    // Fix for Order Summary dark grey rectangle
						    c.setColor (new Color (67, 67, 67));
						    c.fillRect (400, 150, 215, 310);

						    // Fix for pink part on the right of the red rectangle
						    c.setColor (new Color (224, 102, 101));
						    c.fillRect (615, 150, 40, 50);

						    earphone = 2;

						    // ORDER SUMMARY CALCULATIONS

						    // Dark grey rectangle placed over existing text
						    c.setColor (new Color (67, 67, 67));
						    c.fillRect (400, 110, 225, 360);

						    c.setColor (Color.white);
						    c.setFont (ArialBold11);
						    c.drawString ("APPLE AIRPODS", 410, 120);
						    c.drawString ("Base price:                                    $" + earphonePrice, 410, 131);

						    if (earphoneQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
							c.drawString ("Quantity:                                                   " + earphoneQuantity, 410, 142);

						    else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
							c.drawString ("Quantity:                                                 " + earphoneQuantity, 410, 142);

						    earphoneTotal = earphonePrice * earphoneQuantity;
						    c.drawString ("Total:                                             $" + (earphoneTotal), 410, 153);

						    subTotal = subTotal + earphoneTotal; // accumulates subtotal

						    // Covering over extra decimals because we only want 2
						    c.setColor (new Color (67, 67, 67)); // covering grey part
						    c.fillRect (620, 140, 5, 20);
						    c.setColor (new Color (224, 102, 101)); // covering right pink part
						    c.fillRect (625, 140, 50, 300);
						}
					    }
					    else
						if (microphone == 1)
						{
						    // Dark grey rectangle where the price goes
						    c.setColor (new Color (67, 67, 67));
						    c.fillRect (330, 150, 40, 13);

						    // Item name, price, seller
						    c.setFont (ArialBold11);
						    c.setColor (Color.white);
						    c.drawString ("AUDIO TECHNICA AT752 MIC                              $74.99", 95, 160);
						    c.setFont (CalibriPlain10);
						    c.setColor (new Color (224, 217, 217));
						    c.drawString ("Sold by Audio-Technica", 95, 170);

						    // Quantity input
						    c.setFont (ArialBold11);
						    c.setColor (Color.white);
						    c.drawString ("Quantity?: ", 95, 195);
						    c.setCursor (10, 20);
						    c.setTextColor (Color.white);
						    c.setTextBackgroundColour (new Color (254, 0, 0));

						    microphoneQuantity = c.readInt ();

						    if (!(microphoneQuantity > 0))
						    {
							// Dark grey rectangle placed over existing text on order summary
							c.setColor (new Color (67, 67, 67));
							c.fillRect (400, 140, 225, 330);

							// Fix for pink part on the left of the red rectangle
							c.setColor (new Color (224, 102, 101));
							c.fillRect (380, 150, 20, 50);

							// Fix for pink part on the right of the red rectangle
							c.setColor (new Color (224, 102, 101));
							c.fillRect (625, 150, 40, 50);

							// Grey popup
							c.setColor (new Color (67, 67, 67));
							c.fillRect (180, 130, 290, 220);

							// White outline
							c.setColor (Color.white);
							c.drawRect (180, 130, 290, 220);

							// "Error!"
							c.setFont (CandaraBold24);
							c.setColor (Color.white);
							c.drawString ("Error!", 200, 165);

							// White Line
							c.drawLine (200, 173, 450, 173);

							// Error message
							Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
							c.setFont (ArialBold11);
							c.drawString ("You entered an invalid quantity value.", 200, 190);
							c.drawString ("The value you entered is either:", 200, 201);
							c.drawString ("1. Negative", 200, 212);
							c.drawString ("2. Zero", 200, 223);
							c.drawString ("If you are looking to remove an item from", 200, 245);
							c.drawString ("the cart or to clear the cart altogether,", 200, 256);
							c.drawString ("you will be given a chance to do so once you've", 200, 267);
							c.drawString ("entered a quantity for each item you've added.", 200, 278);
							c.drawString ("Please enter a quantity which is positive.", 200, 300);

							// OK button
							c.fillRect (275, 310, 100, 35);
							c.setColor (new Color (67, 67, 67));
							c.drawOval (282, 314, 25, 25);

							Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
							c.setFont (CandaraBold20);
							c.drawString ("Y", 290, 334);
							Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
							c.setFont (ArialBold24);
							c.drawString ("OK", 318, 335);


							do
							{
							    errorAcknowledge = c.getChar ();
							}
							while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

						    }
						    else
						    {
							errorAcknowledge = 'X';


							// Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
							// to the end of the program which is of that colour. The following is a fix for that.

							// Fix for pink part on the right of the red rectangle
							c.setColor (new Color (224, 102, 101));
							c.fillRect (380, 150, 20, 50);

							// Fix for Order Summary dark grey rectangle
							c.setColor (new Color (67, 67, 67));
							c.fillRect (400, 150, 215, 310);

							// Fix for pink part on the right of the red rectangle
							c.setColor (new Color (224, 102, 101));
							c.fillRect (615, 150, 40, 50);

							microphone = 2;

							// ORDER SUMMARY CALCULATIONS

							// Dark grey rectangle placed over existing text
							c.setColor (new Color (67, 67, 67));
							c.fillRect (400, 110, 225, 360);

							c.setColor (Color.white);
							c.setFont (ArialBold11);
							c.drawString ("AUDIO TECHNICA AT752 MIC", 410, 120);
							c.drawString ("Base price:                                      $" + microphonePrice, 410, 131);

							if (microphoneQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
							    c.drawString ("Quantity:                                                   " + microphoneQuantity, 410, 142);

							else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
							    c.drawString ("Quantity:                                                 " + microphoneQuantity, 410, 142);

							microphoneTotal = microphonePrice * microphoneQuantity;
							c.drawString ("Total:                                               $" + (microphoneTotal), 410, 153);

							subTotal = subTotal + microphoneTotal; // accumulates subtotal

							// Covering over extra decimals because we only want 2
							c.setColor (new Color (67, 67, 67)); // covering grey part
							c.fillRect (620, 140, 5, 20);
							c.setColor (new Color (224, 102, 101)); // covering right pink part
							c.fillRect (625, 140, 50, 300);
						    }
						}
				}

				if ((totalItems >= 2) && ((errorAcknowledge == 'X') || (errorAcknowledge == 'X')))
				{

				    c.setColor (Color.white);
				    c.drawOval (35, 246, 30, 30); // circle with '2' in it
				    c.setFont (f3);
				    c.drawString ("2", 46, 268); // "2"
				    c.drawLine (80, 235, 80, 290); // white line

				    // If the only item they purchased is the headphone...
				    if (radio == 1)
				    {
					// Dark grey rectangle where the price goes
					c.setColor (new Color (67, 67, 67));
					c.fillRect (330, 235, 40, 13);

					// Item name, price, seller
					c.setFont (ArialBold11);
					c.setColor (Color.white);
					c.drawString ("SONY MX42-C AM/FM PORTABLE RADIO          $18.99", 95, 245);
					c.setFont (CalibriPlain10);
					c.setColor (new Color (224, 217, 217));
					c.drawString ("Sold by SONY", 95, 255);

					// Quantity input
					c.setFont (ArialBold11);
					c.setColor (Color.white);
					c.drawString ("Quantity?: ", 95, 274);
					c.setCursor (14, 20);
					c.setTextColor (Color.white);
					c.setTextBackgroundColour (new Color (74, 134, 232));

					radioQuantity = c.readInt ();

					if (!(radioQuantity > 0))
					{
					    // Dark grey rectangle placed over existing text on order summary
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (400, 160, 225, 310);

					    // Fix for pink part on the left of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (380, 150, 20, 300);

					    // Fix for pink part on the right of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (625, 150, 40, 300);

					    // Grey popup
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (180, 130, 290, 220);

					    // White outline
					    c.setColor (Color.white);
					    c.drawRect (180, 130, 290, 220);

					    // "Error!"
					    c.setFont (CandaraBold24);
					    c.setColor (Color.white);
					    c.drawString ("Error!", 200, 165);

					    // White Line
					    c.drawLine (200, 173, 450, 173);

					    // Error message
					    Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
					    c.setFont (ArialBold11);
					    c.drawString ("You entered an invalid quantity value.", 200, 190);
					    c.drawString ("The value you entered is either:", 200, 201);
					    c.drawString ("1. Negative", 200, 212);
					    c.drawString ("2. Zero", 200, 223);
					    c.drawString ("If you are looking to remove an item from", 200, 245);
					    c.drawString ("the cart or to clear the cart altogether,", 200, 256);
					    c.drawString ("you will be given a chance to do so once you've", 200, 267);
					    c.drawString ("entered a quantity for each item you've added.", 200, 278);
					    c.drawString ("Please enter a quantity which is positive.", 200, 300);

					    // OK button
					    c.fillRect (275, 310, 100, 35);
					    c.setColor (new Color (67, 67, 67));
					    c.drawOval (282, 314, 25, 25);

					    Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
					    c.setFont (CandaraBold20);
					    c.drawString ("Y", 290, 334);
					    Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
					    c.setFont (ArialBold24);
					    c.drawString ("OK", 318, 335);

					    if (headphone == 2) // value has to be reset or next time headphone won't be listed
						headphone = 1;


					    do
					    {
						errorAcknowledge = c.getChar ();
					    }
					    while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

					}
					else
					{
					    errorAcknowledge = 'X';


					    // Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
					    // to the end of the program which is of that colour. The following is a fix for that.

					    // Fix for pink part on the right of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (380, 200, 20, 100);

					    // Fix for Order Summary dark grey rectangle
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (400, 170, 225, 300);

					    // Fix for pink part on the right of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (625, 200, 40, 100);

					    radio = 2;

					    // ORDER SUMMARY CALCULATIONS

					    c.setColor (Color.white);
					    c.setFont (ArialBold11);
					    c.drawString ("SONY MX42-C AM/FM PORTABLE RADIO", 410, 175);
					    c.drawString ("Base price:                                      $" + radioPrice, 410, 186);

					    if (radioQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
						c.drawString ("Quantity:                                                   " + radioQuantity, 410, 197);

					    else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
						c.drawString ("Quantity:                                                 " + radioQuantity, 410, 197);

					    radioTotal = radioPrice * radioQuantity;
					    c.drawString ("Total:                                               $" + (radioTotal), 410, 208);

					    subTotal = subTotal + radioTotal; // accumulates subtotal

					    // Covering over extra decimals because we only want 2
					    c.setColor (new Color (67, 67, 67)); // covering grey part
					    c.fillRect (620, 200, 5, 20);
					    c.setColor (new Color (224, 102, 101)); // covering right pink part
					    c.fillRect (625, 140, 50, 300);
					}
				    }
				    else
					if (earphone == 1)
					{
					    // Dark grey rectangle where the price goes
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (330, 235, 40, 13);

					    // Item name, price, seller
					    c.setFont (ArialBold11);
					    c.setColor (Color.white);
					    c.drawString ("APPLE AIRPODS                                                  $219.99", 95, 245);
					    c.setFont (CalibriPlain10);
					    c.setColor (new Color (224, 217, 217));
					    c.drawString ("Sold by Apple", 95, 255);

					    // Quantity input
					    c.setFont (ArialBold11);
					    c.setColor (Color.white);
					    c.drawString ("Quantity?: ", 95, 274);
					    c.setCursor (14, 20);
					    c.setTextColor (Color.white);
					    c.setTextBackgroundColour (new Color (74, 134, 232));

					    earphoneQuantity = c.readInt ();

					    if (!(earphoneQuantity > 0))
					    {
						// Dark grey rectangle placed over existing text on order summary
						c.setColor (new Color (67, 67, 67));
						c.fillRect (400, 160, 225, 310);

						// Fix for pink part on the left of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (380, 150, 20, 300);

						// Fix for pink part on the right of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (625, 150, 40, 300);

						// Grey popup
						c.setColor (new Color (67, 67, 67));
						c.fillRect (180, 130, 290, 220);

						// White outline
						c.setColor (Color.white);
						c.drawRect (180, 130, 290, 220);

						// "Error!"
						c.setFont (CandaraBold24);
						c.setColor (Color.white);
						c.drawString ("Error!", 200, 165);

						// White Line
						c.drawLine (200, 173, 450, 173);

						// Error message
						Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
						c.setFont (ArialBold11);
						c.drawString ("You entered an invalid quantity value.", 200, 190);
						c.drawString ("The value you entered is either:", 200, 201);
						c.drawString ("1. Negative", 200, 212);
						c.drawString ("2. Zero", 200, 223);
						c.drawString ("If you are looking to remove an item from", 200, 245);
						c.drawString ("the cart or to clear the cart altogether,", 200, 256);
						c.drawString ("you will be given a chance to do so once you've", 200, 267);
						c.drawString ("entered a quantity for each item you've added.", 200, 278);
						c.drawString ("Please enter a quantity which is positive.", 200, 300);

						// OK button
						c.fillRect (275, 310, 100, 35);
						c.setColor (new Color (67, 67, 67));
						c.drawOval (282, 314, 25, 25);

						Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
						c.setFont (CandaraBold20);
						c.drawString ("Y", 290, 334);
						Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
						c.setFont (ArialBold24);
						c.drawString ("OK", 318, 335);

						if (headphone == 2)  // value has to be reset or next time item(s) won't be listed
						    headphone = 1;

						if (radio == 2) // value has to be reset or next time item won't be listed
						    radio = 1;

						do
						{
						    errorAcknowledge = c.getChar ();
						}
						while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

					    }
					    else
					    {
						errorAcknowledge = 'X';


						// Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
						// to the end of the program which is of that colour. The following is a fix for that.

						// Fix for pink part on the right of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (380, 200, 20, 100);

						// Fix for Order Summary dark grey rectangle
						c.setColor (new Color (67, 67, 67));
						c.fillRect (400, 170, 225, 300);

						// Fix for pink part on the right of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (625, 200, 40, 100);

						earphone = 2;

						// ORDER SUMMARY CALCULATIONS

						c.setColor (Color.white);
						c.setFont (ArialBold11);
						c.drawString ("APPLE AIRPODS", 410, 175);
						c.drawString ("Base price:                                    $" + earphonePrice, 410, 186);

						if (earphoneQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
						    c.drawString ("Quantity:                                                   " + earphoneQuantity, 410, 197);

						else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
						    c.drawString ("Quantity:                                                 " + earphoneQuantity, 410, 197);

						earphoneTotal = earphonePrice * earphoneQuantity;
						c.drawString ("Total:                                             $" + (earphoneTotal), 410, 208);

						subTotal = subTotal + earphoneTotal; // accumulates subtotal

						// Covering over extra decimals because we only want 2
						c.setColor (new Color (67, 67, 67)); // covering grey part
						c.fillRect (620, 200, 5, 20);
						c.setColor (new Color (224, 102, 101)); // covering right pink part
						c.fillRect (625, 140, 50, 300);
					    }
					}
					else
					    if (microphone == 1)
					    {
						// Dark grey rectangle where the price goes
						c.setColor (new Color (67, 67, 67));
						c.fillRect (330, 235, 40, 13);

						// Item name, price, seller
						c.setFont (ArialBold11);
						c.setColor (Color.white);
						c.drawString ("AUDIO TECHNICA AT752 MIC                              $74.99", 95, 245);
						c.setFont (CalibriPlain10);
						c.setColor (new Color (224, 217, 217));
						c.drawString ("Sold by Audio-Technica", 95, 255);

						// Quantity input
						c.setFont (ArialBold11);
						c.setColor (Color.white);
						c.drawString ("Quantity?: ", 95, 274);
						c.setCursor (14, 20);
						c.setTextColor (Color.white);
						c.setTextBackgroundColour (new Color (74, 134, 232));

						microphoneQuantity = c.readInt ();

						if (!(microphoneQuantity > 0))
						{
						    // Dark grey rectangle placed over existing text on order summary
						    c.setColor (new Color (67, 67, 67));
						    c.fillRect (400, 160, 225, 310);

						    // Fix for pink part on the left of the red rectangle
						    c.setColor (new Color (224, 102, 101));
						    c.fillRect (380, 150, 20, 300);

						    // Fix for pink part on the right of the red rectangle
						    c.setColor (new Color (224, 102, 101));
						    c.fillRect (625, 150, 40, 300);

						    // Grey popup
						    c.setColor (new Color (67, 67, 67));
						    c.fillRect (180, 130, 290, 220);

						    // White outline
						    c.setColor (Color.white);
						    c.drawRect (180, 130, 290, 220);

						    // "Error!"
						    c.setFont (CandaraBold24);
						    c.setColor (Color.white);
						    c.drawString ("Error!", 200, 165);

						    // White Line
						    c.drawLine (200, 173, 450, 173);

						    // Error message
						    Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
						    c.setFont (ArialBold11);
						    c.drawString ("You entered an invalid quantity value.", 200, 190);
						    c.drawString ("The value you entered is either:", 200, 201);
						    c.drawString ("1. Negative", 200, 212);
						    c.drawString ("2. Zero", 200, 223);
						    c.drawString ("If you are looking to remove an item from", 200, 245);
						    c.drawString ("the cart or to clear the cart altogether,", 200, 256);
						    c.drawString ("you will be given a chance to do so once you've", 200, 267);
						    c.drawString ("entered a quantity for each item you've added.", 200, 278);
						    c.drawString ("Please enter a quantity which is positive.", 200, 300);

						    // OK button
						    c.fillRect (275, 310, 100, 35);
						    c.setColor (new Color (67, 67, 67));
						    c.drawOval (282, 314, 25, 25);

						    Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
						    c.setFont (CandaraBold20);
						    c.drawString ("Y", 290, 334);
						    Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
						    c.setFont (ArialBold24);
						    c.drawString ("OK", 318, 335);

						    if (headphone == 2)  // value has to be reset or next time item(s) won't be listed
							headphone = 1;

						    if (radio == 2) // value has to be reset or next time item won't be listed
							radio = 1;

						    if (earphone == 2) // value has to be reset or next time item won't be listed
							earphone = 1;


						    do
						    {
							errorAcknowledge = c.getChar ();
						    }
						    while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

						}
						else
						{
						    errorAcknowledge = 'X';


						    // Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
						    // to the end of the program which is of that colour. The following is a fix for that.

						    // Fix for pink part on the right of the red rectangle
						    c.setColor (new Color (224, 102, 101));
						    c.fillRect (380, 200, 20, 100);

						    // Fix for Order Summary dark grey rectangle
						    c.setColor (new Color (67, 67, 67));
						    c.fillRect (400, 170, 225, 300);

						    // Fix for pink part on the right of the red rectangle
						    c.setColor (new Color (224, 102, 101));
						    c.fillRect (625, 200, 40, 100);

						    microphone = 2;

						    // ORDER SUMMARY CALCULATIONS

						    c.setColor (Color.white);
						    c.setFont (ArialBold11);
						    c.drawString ("AUDIO TECHNICA AT752 MIC", 410, 175);
						    c.drawString ("Base price:                                      $" + microphonePrice, 410, 186);

						    if (microphoneQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
							c.drawString ("Quantity:                                                   " + microphoneQuantity, 410, 197);

						    else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
							c.drawString ("Quantity:                                                 " + microphoneQuantity, 410, 197);

						    microphoneTotal = microphonePrice * microphoneQuantity;
						    c.drawString ("Total:                                               $" + (microphoneTotal), 410, 208);

						    subTotal = subTotal + microphoneTotal; // accumulates subtotal

						    // Covering over extra decimals because we only want 2
						    c.setColor (new Color (67, 67, 67)); // covering grey part
						    c.fillRect (620, 200, 5, 20);
						    c.setColor (new Color (224, 102, 101)); // covering right pink part
						    c.fillRect (625, 140, 50, 300);
						}
					    }
				}


				if ((totalItems >= 3) && ((errorAcknowledge == 'X') || (errorAcknowledge == 'X')))
				{
				    c.setColor (new Color (67, 67, 67));
				    c.drawOval (35, 331, 30, 30); // circle with '3' in it
				    c.setFont (f3);
				    c.drawString ("3", 46, 353); // "3"
				    c.drawLine (80, 320, 80, 375); // white line

				    if (earphone == 1)
				    {
					// Dark grey rectangle where the price goes
					c.setColor (new Color (67, 67, 67));
					c.fillRect (330, 320, 40, 13);

					// Item name, price, seller
					c.setFont (ArialBold11);
					c.drawString ("APPLE AIRPODS", 95, 330);
					c.setColor (Color.white);
					c.drawString ("$219.99", 330, 330);
					c.setColor (new Color (67, 67, 67));
					c.setFont (CalibriPlain10);
					c.drawString ("Sold by Apple", 95, 340);

					// Quantity input
					c.setFont (ArialBold11);
					c.drawString ("Quantity?: ", 95, 375);
					c.setCursor (19, 20);
					c.setTextColor (new Color (67, 67, 67));
					c.setTextBackgroundColour (new Color (255, 255, 1));

					earphoneQuantity = c.readInt ();

					if (!(earphoneQuantity > 0))
					{
					    // Dark grey rectangle placed over existing text on order summary
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (400, 230, 225, 240);

					    // Fix for pink part on the left of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (380, 150, 20, 300);

					    // Fix for pink part on the right of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (625, 150, 40, 300);

					    // Grey popup
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (180, 130, 290, 220);

					    // White outline
					    c.setColor (Color.white);
					    c.drawRect (180, 130, 290, 220);

					    // "Error!"
					    c.setFont (CandaraBold24);
					    c.setColor (Color.white);
					    c.drawString ("Error!", 200, 165);

					    // White Line
					    c.drawLine (200, 173, 450, 173);

					    // Error message
					    Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
					    c.setFont (ArialBold11);
					    c.drawString ("You entered an invalid quantity value.", 200, 190);
					    c.drawString ("The value you entered is either:", 200, 201);
					    c.drawString ("1. Negative", 200, 212);
					    c.drawString ("2. Zero", 200, 223);
					    c.drawString ("If you are looking to remove an item from", 200, 245);
					    c.drawString ("the cart or to clear the cart altogether,", 200, 256);
					    c.drawString ("you will be given a chance to do so once you've", 200, 267);
					    c.drawString ("entered a quantity for each item you've added.", 200, 278);
					    c.drawString ("Please enter a quantity which is positive.", 200, 300);

					    // OK button
					    c.fillRect (275, 310, 100, 35);
					    c.setColor (new Color (67, 67, 67));
					    c.drawOval (282, 314, 25, 25);

					    Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
					    c.setFont (CandaraBold20);
					    c.drawString ("Y", 290, 334);
					    Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
					    c.setFont (ArialBold24);
					    c.drawString ("OK", 318, 335);

					    if (headphone == 2)  // value has to be reset or next time item won't be listed
						headphone = 1;

					    if (radio == 2) // value has to be reset or next time item won't be listed
						radio = 1;

					    if (earphone == 2) // value has to be reset or next time item won't be listed
						earphone = 1;


					    do
					    {
						errorAcknowledge = c.getChar ();
					    }
					    while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

					}
					else
					{
					    errorAcknowledge = 'X';

					    // Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
					    // to the end of the program which is of that colour. The following is a fix for that.

					    // Fix for pink part on the right of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (380, 350, 20, 100);

					    // Fix for Order Summary dark grey rectangle
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (400, 215, 225, 255);

					    // Fix for pink part on the right of the red rectangle
					    c.setColor (new Color (224, 102, 101));
					    c.fillRect (625, 200, 40, 100);

					    earphone = 2;

					    // ORDER SUMMARY CALCULATIONS

					    c.setColor (Color.white);
					    c.setFont (ArialBold11);
					    c.drawString ("APPLE AIRPODS", 410, 230);
					    c.drawString ("Base price:                                    $" + earphonePrice, 410, 241);

					    if (earphoneQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
						c.drawString ("Quantity:                                                   " + earphoneQuantity, 410, 252);

					    else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
						c.drawString ("Quantity:                                                 " + earphoneQuantity, 410, 252);

					    earphoneTotal = earphonePrice * earphoneQuantity;
					    c.drawString ("Total:                                              $" + (earphoneTotal), 410, 263);

					    subTotal = subTotal + earphoneTotal; // accumulates subtotal

					    // Covering over extra decimals because we only want 2
					    c.setColor (new Color (67, 67, 67)); // covering grey part
					    c.fillRect (620, 250, 5, 20);
					    c.setColor (new Color (224, 102, 101)); // covering right pink part
					    c.fillRect (625, 140, 50, 300);
					}
				    }
				    else
					if (microphone == 1)
					{
					    // Dark grey rectangle where the price goes
					    c.setColor (new Color (67, 67, 67));
					    c.fillRect (330, 320, 40, 13);

					    // Item name, price, seller
					    c.setFont (ArialBold11);
					    c.drawString ("AUDIO TECHNICA AT752 MIC", 95, 330);
					    c.setColor (Color.white);
					    c.drawString ("$74.99", 333, 330);
					    c.setColor (new Color (67, 67, 67));
					    c.setFont (CalibriPlain10);
					    c.drawString ("Sold by Audio-Technica", 95, 340);

					    // Quantity input
					    c.setFont (ArialBold11);
					    c.drawString ("Quantity?: ", 95, 375);
					    c.setCursor (19, 20);
					    c.setTextColor (new Color (67, 67, 67));
					    c.setTextBackgroundColour (new Color (255, 255, 1));

					    microphoneQuantity = c.readInt ();

					    if (!(microphoneQuantity > 0))
					    {
						// Dark grey rectangle placed over existing text on order summary
						c.setColor (new Color (67, 67, 67));
						c.fillRect (400, 230, 225, 240);

						// Fix for pink part on the left of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (380, 150, 20, 300);

						// Fix for pink part on the right of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (625, 150, 40, 300);

						// Grey popup
						c.setColor (new Color (67, 67, 67));
						c.fillRect (180, 130, 290, 220);

						// White outline
						c.setColor (Color.white);
						c.drawRect (180, 130, 290, 220);

						// "Error!"
						c.setFont (CandaraBold24);
						c.setColor (Color.white);
						c.drawString ("Error!", 200, 165);

						// White Line
						c.drawLine (200, 173, 450, 173);

						// Error message
						Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
						c.setFont (ArialBold11);
						c.drawString ("You entered an invalid quantity value.", 200, 190);
						c.drawString ("The value you entered is either:", 200, 201);
						c.drawString ("1. Negative", 200, 212);
						c.drawString ("2. Zero", 200, 223);
						c.drawString ("If you are looking to remove an item from", 200, 245);
						c.drawString ("the cart or to clear the cart altogether,", 200, 256);
						c.drawString ("you will be given a chance to do so once you've", 200, 267);
						c.drawString ("entered a quantity for each item you've added.", 200, 278);
						c.drawString ("Please enter a quantity which is positive.", 200, 300);

						// OK button
						c.fillRect (275, 310, 100, 35);
						c.setColor (new Color (67, 67, 67));
						c.drawOval (282, 314, 25, 25);

						Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
						c.setFont (CandaraBold20);
						c.drawString ("Y", 290, 334);
						Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
						c.setFont (ArialBold24);
						c.drawString ("OK", 318, 335);

						if (headphone == 2)  // value has to be reset or next time item(s) won't be listed
						    headphone = 1;

						if (radio == 2) // value has to be reset or next time item won't be listed
						    radio = 1;

						if (earphone == 2) // value has to be reset or next time item won't be listed
						    earphone = 1;


						do
						{
						    errorAcknowledge = c.getChar ();
						}
						while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

					    }
					    else
					    {
						errorAcknowledge = 'X';

						// Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
						// to the end of the program which is of that colour. The following is a fix for that.

						// Fix for pink part on the right of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (380, 350, 20, 100);

						// Fix for Order Summary dark grey rectangle
						c.setColor (new Color (67, 67, 67));
						c.fillRect (400, 215, 225, 255);

						// Fix for pink part on the right of the red rectangle
						c.setColor (new Color (224, 102, 101));
						c.fillRect (625, 200, 40, 100);

						microphone = 2;

						// ORDER SUMMARY CALCULATIONS

						c.setColor (Color.white);
						c.setFont (ArialBold11);
						c.drawString ("AUDIO-TECHNICA AT752 MIC", 410, 230);
						c.drawString ("Base price:                                      $" + microphonePrice, 410, 241);

						if (microphoneQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
						    c.drawString ("Quantity:                                                   " + microphoneQuantity, 410, 252);

						else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
						    c.drawString ("Quantity:                                                 " + microphoneQuantity, 410, 252);

						microphoneTotal = microphonePrice * microphoneQuantity;
						c.drawString ("Total:                                               $" + (microphoneTotal), 410, 263);

						subTotal = subTotal + microphoneTotal; // accumulates subtotal

						// Covering over extra decimals because we only want 2
						c.setColor (new Color (67, 67, 67)); // covering grey part
						c.fillRect (620, 250, 5, 30);
						c.setColor (new Color (224, 102, 101)); // covering right pink part
						c.fillRect (625, 140, 50, 300);
					    }
					}
				}

				if ((totalItems == 4) && ((errorAcknowledge == 'X') || (errorAcknowledge == 'X')))
				{

				    c.setColor (new Color (67, 67, 67));
				    c.drawOval (35, 416, 30, 30); // circle with '4' in it
				    c.setFont (f3);
				    c.drawString ("4", 46, 438);
				    c.drawLine (80, 405, 80, 460); // white line


				    // MICROPHONE

				    // Dark grey rectangle where the price goes
				    c.setColor (new Color (67, 67, 67));
				    c.fillRect (330, 405, 40, 13);

				    // Item name, price, seller
				    c.setFont (ArialBold11);
				    c.drawString ("AUDIO TECHNICA AT752 MIC", 95, 415);
				    c.setColor (Color.white);
				    c.drawString ("$74.99", 333, 415);
				    c.setColor (new Color (67, 67, 67));
				    c.setFont (CalibriPlain10);
				    c.drawString ("Sold by Audio-Technica", 95, 425);

				    // Quantity input
				    c.setFont (ArialBold11);
				    c.drawString ("Quantity?: ", 95, 455);
				    c.setCursor (23, 20);
				    c.setTextColor (new Color (67, 67, 67));
				    c.setTextBackgroundColour (new Color (0, 255, 1));

				    microphoneQuantity = c.readInt ();

				    if (!(microphoneQuantity > 0))
				    {
					// Dark grey rectangle placed over existing text on order summary
					c.setColor (new Color (67, 67, 67));
					c.fillRect (400, 300, 225, 170);

					// Fix for pink part on the left of the red rectangle
					c.setColor (new Color (224, 102, 101));
					c.fillRect (380, 150, 20, 350);

					// Fix for pink part on the right of the red rectangle
					c.setColor (new Color (224, 102, 101));
					c.fillRect (625, 150, 40, 350);

					// Grey popup
					c.setColor (new Color (67, 67, 67));
					c.fillRect (180, 130, 290, 220);

					// White outline
					c.setColor (Color.white);
					c.drawRect (180, 130, 290, 220);

					// "Error!"
					c.setFont (CandaraBold24);
					c.setColor (Color.white);
					c.drawString ("Error!", 200, 165);

					// White Line
					c.drawLine (200, 173, 450, 173);

					// Error message
					Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);
					c.setFont (ArialBold11);
					c.drawString ("You entered an invalid quantity value.", 200, 190);
					c.drawString ("The value you entered is either:", 200, 201);
					c.drawString ("1. Negative", 200, 212);
					c.drawString ("2. Zero", 200, 223);
					c.drawString ("If you are looking to remove an item from", 200, 245);
					c.drawString ("the cart or to clear the cart altogether,", 200, 256);
					c.drawString ("you will be given a chance to do so once you've", 200, 267);
					c.drawString ("entered a quantity for each item you've added.", 200, 278);
					c.drawString ("Please enter a quantity which is positive.", 200, 300);

					// OK button
					c.fillRect (275, 310, 100, 35);
					c.setColor (new Color (67, 67, 67));
					c.drawOval (282, 314, 25, 25);

					Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
					c.setFont (CandaraBold20);
					c.drawString ("Y", 290, 334);
					Font ArialBold24 = new Font ("Arial", Font.BOLD, 22);
					c.setFont (ArialBold24);
					c.drawString ("OK", 318, 335);

					if (headphone == 2)  // value has to be reset or next time item(s) won't be listed
					    headphone = 1;

					if (radio == 2) // value has to be reset or next time item won't be listed
					    radio = 1;

					if (earphone == 2) // value has to be reset or next time item won't be listed
					    earphone = 1;


					do
					{
					    errorAcknowledge = c.getChar ();
					}
					while ((errorAcknowledge != 'Y') && (errorAcknowledge != 'y'));

				    }
				    else
				    {
					errorAcknowledge = 'X';


					// Because of c.setTextBackgroundColour, when the user enters a number, a rectangle is drawn all the way
					// to the end of the program which is of that colour. The following is a fix for that.

					// Fix for pink part on the right of the red rectangle
					c.setColor (new Color (224, 102, 101));
					c.fillRect (380, 380, 20, 100);

					// Fix for Order Summary dark grey rectangle
					c.setColor (new Color (67, 67, 67));
					c.fillRect (400, 265, 225, 205);

					// Fix for pink part on the right of the red rectangle
					c.setColor (new Color (224, 102, 101));
					c.fillRect (625, 250, 40, 300);

					microphone = 2;

					// ORDER SUMMARY CALCULATIONS

					c.setColor (Color.white);
					c.setFont (ArialBold11);
					c.drawString ("AUDIO-TECHNICA AT752 MIC", 410, 285);
					c.drawString ("Base price:                                      $" + microphonePrice, 410, 296);

					if (microphoneQuantity < 10) // if the quantity has only 1 digit, we need to format it to align properly
					    c.drawString ("Quantity:                                                   " + microphoneQuantity, 410, 307);

					else // if the quantity has more than 1 digit...this will format it. I'm only doing 1 & 2 digits because otherwise I'd be doing this forever and it's unlikely anyone will buy that many anyway.
					    c.drawString ("Quantity:                                                 " + microphoneQuantity, 410, 307);

					microphoneTotal = microphonePrice * microphoneQuantity;
					c.drawString ("Total:                                               $" + (microphoneTotal), 410, 318);

					subTotal = subTotal + microphoneTotal; // accumulates subtotal

					// Covering over extra decimals because we only want 2
					c.setColor (new Color (67, 67, 67)); // covering grey part
					c.fillRect (620, 300, 5, 30);
					c.setColor (new Color (224, 102, 101)); // covering right pink part
					c.fillRect (625, 140, 50, 300);
				    }
				}
			    }
			    while ((errorAcknowledge == 'Y') || (errorAcknowledge == 'y'));


			    // ORDER CALCULATIONS

			    Font ArialBold12 = new Font ("Arial", Font.BOLD, 12);

			    // Total before taxes
			    c.setFont (ArialBold12);
			    //subTotal = headphoneTotal + radioTotal + earphoneTotal + microphoneTotal;
			    c.setColor (Color.white);
			    c.drawString ("Total before taxes:                    $" + subTotal, 410, 341);

			    // Taxes
			    tax = subTotal * 0.13;
			    c.drawString ("Tax (13%):                                      $" + tax, 410, 354);

			    // Total
			    total = subTotal + tax;
			    c.drawString ("Total:                                             $" + total, 410, 376);

			    // Covering over extra decimals because we only want 2
			    c.setColor (new Color (67, 67, 67)); // covering grey part
			    c.fillRect (620, 300, 5, 100);
			    c.setColor (new Color (224, 102, 101)); // covering right pink part
			    c.fillRect (625, 140, 50, 400);

			    // CONFIRMATION BUTTON

			    // White rounded rectangle (button shape)
			    c.setColor (Color.white);
			    c.fillRoundRect (420, 400, 185, 45, 50, 50);

			    // Grey circle with 'C' in it
			    c.setColor (new Color (67, 67, 67));
			    c.drawOval (435, 407, 30, 30);
			    Font C = new Font ("Arial", Font.PLAIN, 18);
			    c.setFont (C);
			    c.drawString ("C", 444, 429);
			    Font Confirm = new Font ("Arial", Font.PLAIN, 20);
			    c.setFont (Confirm);
			    c.drawString ("CONFIRM", 480, 430);

			    // CLEAR CART AND RETURN TO INVENTORY BUTTON

			    // Red button
			    c.setColor (new Color (254, 0, 0));
			    c.fillRect (158, 100, 225, 25);

			    // White circle with R in it
			    c.setColor (Color.white);
			    c.drawOval (166, 104, 17, 17);

			    // "R"
			    Font ArialBold11 = new Font ("Arial", Font.BOLD, 11);
			    c.setFont (ArialBold11);
			    c.drawString ("R", 172, 117);

			    // "Clear Cart and Return to Inventory"

			    c.drawString ("Clear Cart and Return to Inventory", 192, 117);

			    do
			    {
				finalStep = c.getChar ();
			    }
			    while ((finalStep != 'R') && (finalStep != 'r') && (finalStep != 'C') && (finalStep != 'c'));

			    if ((finalStep == 'C') || (finalStep == 'c'))
			    {
				// Pink background
				c.setColor (new Color (224, 102, 101));
				c.fillRect (0, 0, 2000, 2000);

				// Top grey bar
				c.setColor (new Color (67, 67, 67));
				c.fillRect (0, 0, 2000, 60);

				// "sbay"
				c.setFont (f);
				c.setColor (new Color (254, 0, 0)); // red
				c.drawString ("s", 15, 40);
				c.setColor (new Color (74, 134, 232)); // blue
				c.drawString ("b", 30, 40);
				c.setColor (new Color (255, 255, 1)); // yellow
				c.drawString ("a", 51, 40);
				c.setColor (new Color (0, 255, 1)); // green
				c.drawString ("y", 68, 40);

				// Line between "sbay" and "Est. 2018"
				c.setColor (Color.white);
				c.fillRect (100, 13, 2, 35);

				// Est. 2018
				c.setFont (f2);
				c.drawString ("Est. 2018", 120, 39);

				// 24/7 Help-desk: 1-800-111-SBAY
				c.setFont (f3);
				c.drawString ("24/7 Help-desk: 1-800-111-SBAY", 353, 39);

				// Circle with checkmark shape (multiple outlines necessary for thickness)

				// White outline
				c.setColor (Color.white);
				c.fillOval (270, 110, 115, 115);

				// Pink fill
				c.setColor (new Color (224, 102, 101));
				c.fillOval (276, 115, 104, 104);

				// Checkmark

				c.setColor (Color.white);
				int checkxpoints[] = {307, 324, 354, 361, 324, 301};
				int checkypoints[] = {165, 180, 145, 150, 191, 172};
				c.fillPolygon (checkxpoints, checkypoints, 6);

				// "Success"
				Font CandaraBold36 = new Font ("Candara", Font.BOLD, 36);
				c.setFont (CandaraBold36);
				c.drawString ("Success.", 267, 265);

				// "Your order has been placed."
				Font CandaraBold24 = new Font ("Candara", Font.BOLD, 24);
				c.setFont (CandaraBold24);
				c.drawString ("Your order has been placed.", 190, 290);

				// Colorful rectangles
				c.setColor (new Color (254, 0, 0)); // red
				c.fillRect (150, 310, 75, 17);

				c.setColor (new Color (74, 134, 232)); // blue
				c.fillRect (240, 310, 75, 17);

				c.setColor (new Color (255, 255, 1)); // yellow
				c.fillRect (335, 310, 75, 17);

				c.setColor (new Color (0, 255, 1)); // green
				c.fillRect (430, 310, 75, 17);

				// "Thank you for shopping at sbay."
				c.setColor (Color.white);
				Font CandaraBold20 = new Font ("Candara", Font.BOLD, 20);
				c.setFont (CandaraBold20);
				c.drawString ("Thank you for shopping at            .", 190, 358);

				Font sbay2 = new Font ("Georgia", Font.PLAIN, 22);
				c.setFont (sbay2);
				c.setColor (new Color (254, 0, 0)); // red
				c.drawString ("s", 418, 359);
				c.setColor (new Color (74, 134, 232)); // blue
				c.drawString ("b", 428, 359);
				c.setColor (new Color (255, 255, 1)); // yellow
				c.drawString ("a", 439, 359);
				c.setColor (new Color (0, 255, 1)); // green
				c.drawString ("y", 451, 359);

				// "Copyright © 2018 sbay Inc. All rights reserved. | sbay.ca"
				c.setColor (Color.white);
				c.setFont (ArialBold11);
				c.drawString ("Copyright © 2018 sbay Inc. All rights reserved. | sbay.ca", 180, 490);
			    }
			    else // if they clear the cart & return to inventory
			    {
				// All the values get reset so it's as if they never purchased those items
				headphone = 0;
				radio = 0;
				earphone = 0;
				microphone = 0;
				totalItems = 0;

				// All the totals must be reset too
				headphoneTotal = 0;
				radioTotal = 0;
				earphoneTotal = 0;
				microphoneTotal = 0;
				subTotal = 0;
				tax = 0;
				total = 0;
			    }
			}
		    }
	}
	while (((addOrReturn1 == 'R') || (addOrReturn1 == 'r') || (removeOrReturn1 == 'R') || (removeOrReturn1 == 'r') ||
		    (addOrReturn2 == 'R') || (addOrReturn2 == 'r') || (removeOrReturn2 == 'R') || (removeOrReturn2 == 'r') ||
		    (addOrReturn3 == 'R') || (addOrReturn3 == 'r') || (removeOrReturn3 == 'R') || (removeOrReturn3 == 'r') ||
		    (addOrReturn4 == 'R') || (addOrReturn4 == 'r') || (removeOrReturn4 == 'R') || (removeOrReturn4 == 'r')
		    || (checkoutReturn == 'R') || (checkoutReturn == 'r')) && ((finalStep == 'R') || (finalStep == 'r')));
	// condition that has to be true to return to inventory

    }
} // main method


// AreaAndPerimeter class


