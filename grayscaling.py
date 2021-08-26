 #grayscaling - black and white
#  import cv2
# input = cv2.imread('aa.jpg')
import cv2 
input = cv2.imread('aa.jpg')
cv2.imshow('color image', input)
cv2.waitKey(0)

# bw = cv2.cvtColor(input, cv2.COLOR_BGR2GRAY)
# unother way
bw = cv2.imread('aa.jpg', 0)
# bw = cv2.imread('aa.jpg', 1)

cv2.imshow('grayscaling', bw)
cv2.waitKey(0)
cv2.destroyAllWindows()


# dif = cv2.cvtColor(input, cv2.COLOR_BGR2HLS_FULL)
dif = cv2.cvtColor(input, cv2.COLOR_BGR2RGBA)
# dif = cv2.cvtColor(input, cv2.COLOR_BGR2LAB)
cv2.imshow('grayscaling', dif)
cv2.waitKey(0)
cv2.destroyAllWindows()
