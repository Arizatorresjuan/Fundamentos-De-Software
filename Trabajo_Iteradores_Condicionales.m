
a = randi(100, 1)


if rem(a, 2) == 0
    disp('a is even')
    b = a/2
end

a = randi(100, 1);
if a < 30
    disp('small')
elseif a < 80
    disp('medium')
else
    disp('large')
end


[dayNum, dayString] = weekday(date, 'long', 'en_US')

switch dayString
 case 'Monday'
    disp('Start of the work week')
 case 'Tuesday'
    disp('Day 2')
 case 'Wednesday'
    disp('Day 3')
 case 'Thursday'
    disp('Day 4')
 case 'Friday'
    disp('Last day of the work week')
 otherwise
    disp('Weekend!')
end


yourNumber = input('Enter a number: ');
if yourNumber < 0
    disp('Negative')
elseif yourNumber > 0
    disp('Positive')
else
    disp('Zero')
end

a = 0; fa = -Inf;
b = 3; fb = Inf;
while b-a > eps*b
     x = (a+b)/2;
    fx = x^3-2*x-5;
    if sign(fx) == sign(fa)
         a = x; fa = fx;
    else
         b = x; fb = fx;
    end
end

A = magic(4);
B = A;
B(3,3) = pi
A == B

%Comparacion de matrices
if A > B
 ('greater')
elseif A < B
 ('less')
elseif A == B
 ('equal')

 %Salida controlada por el usuario 
else
 error('Unexpected situation')
end

for n = 3:2:32
 r(n) = rank(magic(n));
end
r

%For anidado
m= 2;
n= 3;
for i = 1:m
     for j = 1:n
         H(i,j) = 1/(i+j)
         i
         j
     end
end
