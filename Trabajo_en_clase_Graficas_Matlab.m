clc
x = linspace(0,2*pi,100);
y = sin(x);
plot(x,y,'--ro')

xlabel('x')
ylabel('sin(x)')
title('Plot of the Sine Function')

hold on
y2 = cos(x);
plot(x,y2,'g:*')
hold off

Y = magic(5)
figure
plot(Y)

x = linspace(0,2*pi,25);
y = sin(x);
ln2 = plot(x,y)
ln2.LineWidth = 2;
ln2.Color = [0 0.5 0.5];
ln2.Marker = 'o';
ln2.MarkerEdgeColor = 'b';

y3 = 2*sin(x);
scatter(x,y3)

x = linspace(0,10,50);
y1 = sin(x);
y2 = rand(50,1);
tiledlayout(2,1)
nexttile
plot(x,y1)
title('Plot 1')
nexttile
scatter(x,y2)
title('Plot 2')


x = linspace(0,10,50);
y1 = sin(x);
y2 = rand(50,1);
% Top two plots
tiledlayout(2,2)
nexttile
plot(x,y1)
nexttile
scatter(x,y2)
% Plot that spans
nexttile([1 2])
y2 = rand(50,1);
plot(x,y2)


x = linspace(0,10,50);
y1 = sin(x);
y2 = rand(50,1);
tiledlayout(2,1)
% Top plot
ax1 = nexttile;
plot(ax1,x,y1)
title(ax1,'Plot 1')
ax1.FontSize = 14;
ax1.XColor = 'red';
% Bottom plot
ax2 = nexttile;
scatter(ax2,x,y2)
title(ax2,'Plot 2')
grid(ax2,'of')

x = linspace(0,25);
y = sin(x/2);
yyaxis left
plot(x,y);

r = x.^2/2;
yyaxis right
plot(x,r);


yyaxis right
cla reset
load count.dat;
m = mean(count,2);
e = std(count,1,2);
errorbar(m,e)
