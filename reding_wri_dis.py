import cv2
input = cv2.imread('aa.jpg')
cv2.imshow('hello', input)
cv2.waitKey(500) #if we write 0 then image show for unlimitad time
cv2.destroyAllWindows() 

# Import numpy
import numpy as np
print(input.shape) #display dimensions of the image

#for showing image pixels
print ('Hight of Image', int(input.shape[0]), 'pixels')
print ('width of Image', int(input.shape[1]), 'pixels')

cv2.imwrite('new_image', input) #create new image is name is new_image and it copy form image varible
