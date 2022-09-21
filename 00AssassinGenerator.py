from random import shuffle

players = []

with open("./00players.txt", 'r') as inp:
	players = inp.read().split('\n')

#print(players)
shuffle(players)
#print(players)

for i, player in enumerate(players):
	with open(player+".txt", 'w') as out:
		out.write("Your mission, should you choose to accept it, is to kill "+players[(i+1)%len(players)]+". The rules of engagement\n")
		out.write("are as follows. To kill a target, you must shoot them with your commissioned water pistol.\n")
		out.write("Personal water guns may also be permitted. In order for a kill to be considered valid, no one\n")
		out.write("else FROM CEDRO may witness the kill. If someone spots you attempting to shoot your target, your\n") 
		out.write("cover is blown and your assassination fails. All bedrooms and bathrooms are considered safe\n")
		out.write("zones. When you kill your target, you acquire their target. Elimination continues until only one\n")
		out.write("survivor remains. Do not discuss your target at risk of your target discovering who is coming for\n")
		out.write("them. The winner will receive two bags of popcorners. The player with the most kills will recieve\n")
		out.write("one bag of popcorners. All questions may be addressed to Mihir.\n\n")
		out.write("The game begins on Saturday 01/26/2019 at 3:00 am. Good luck "+player+".")