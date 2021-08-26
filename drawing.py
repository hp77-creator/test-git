import cv2
import numpy as np

#1. creat a black image
image = np.zeros((512, 512, 3), np.uint8)

# make this in black and white
image_bw = np.zeros((512, 512), np.uint8)


cv2.imshow("Black ractangle (color)", image)
cv2.imshow("Black ractangle (b&w)", image_bw)

#2. add line over black sqare
# cv2.line(image, (0, 0), (511, 511), (255, 127, 0), 5)
# cv2.imshow("Blue line", image)
# cv2.waitKey(0)
# cv2.destroyAllWindows()

#Drw a rectangle 
# cv2.rectangle(image, (200, 100), (300, 250),(127, 50, 127), 5) #if we put thikness -1 then box will full black
# cv2.imshow("Rectangle", image) 
# cv2.waitKey(0)
# cv2.destroyAllWindows()

# crilcles
# cv2.circle(image, (350, 350), 100, (15, 75, 50), 5)
# cv2.imshow("cricle", image) 
# cv2.waitKey(0)
# cv2.destroyAllWindows()

#puntex
cv2.putText(image, 'Hello World!', (100, 200), cv2.cv2.FONT_HERSHEY_SCRIPT_SIMPLEX, 2, (100, 170, 0), 3)
cv2.imshow("hello", image)
cv2.waitKey(0)
cv2.destroyAllWindows()

 