package constant;

import smartItem.SmartItemCommunication;
import smartItem.SmartItemDedicatePower;
import smartItem.SmartItemPlan;
import smartItem.SmartItemSkill;
import smartItem.SmartItemStat;
import utility.Data;
import utility.Tuple;

/**
 * Donne les tableau de drop des atouts d'objet intelligent.
 * @author Mentra20
 *
 */
public class SmartItemConstant {

	//Tableau pour determiner l'alignement de l'objet
	public static Data<String> alignement(){
		Data<String> res = new Data<String>();
		
		res.add(new Tuple<String, Integer>("Chaotique Bon", 10));
		res.add(new Tuple<String, Integer>("Chaotique Neutre", 10));
		res.add(new Tuple<String, Integer>("Chaotique Mauvais", 15));
		res.add(new Tuple<String, Integer>("Neutre Mauvais", 10));
		res.add(new Tuple<String, Integer>("Loyal Mauvais", 10));
		res.add(new Tuple<String, Integer>("Loyal Bon", 15));
		res.add(new Tuple<String, Integer>("Loyal Neutre", 10));
		res.add(new Tuple<String, Integer>("Neutre Bon", 10));
		res.add(new Tuple<String, Integer>("Neutre", 10));
		
		return res;
	}
	
	//Tableau pour determiner les statistiques de l'objet (fait à la main)
	public static Data<SmartItemStat> statistics(){
		Data<SmartItemStat> res = new Data<SmartItemStat>();
		
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(10, 0, 0), 20));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(11, 200, 0), 14));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(12, 500, 1), 13));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(13, 700, 1), 11));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(14, 1000, 2), 9));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(15, 1400, 2), 8));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(16, 2000, 3), 7));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(17, 2800, 3), 6));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(18, 4000, 4), 5));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(19, 5200, 4), 4));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(20, 8000, 5), 3));
		
		return res;
	}
	
	//Tableau pour determiner les capacité de communication de l'objet (fait à la main)
	public static Data<SmartItemCommunication> communicationCapacity(){
		Data<SmartItemCommunication> res = new Data<SmartItemCommunication>();
		
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Parole", 500, 0), 18));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Télépathie", 1000, 1), 12));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Sens (18m)", 500, 0), 15));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Sens (36m)", 1000, 0), 12));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Vision dans le noir", 500, 0), 14));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Vision aveugle", 5000, 1), 8));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Lecture des langages	", 1000, 1), 11));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Lecture de la magie", 2000, 1), 10));
		
		return res;
	}
	
	//Tableau pour determiner les pouvoirs de l'objet 
	public static Data<SmartItemSkill> powerList(){
		Data<SmartItemSkill> res = new Data<SmartItemSkill>();
		
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut lancer un sort de niveau 0, à volonté", 1000, 1), 10));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut lancer un sort de niveau 1, 3/jour", 1200, 1), 10));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut lancer aura magique sur lui à volonté", 2000, 1), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut lancer un sort de niveau 2, 1/jour", 2400, 1), 10));	
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet a 5 rangs dans une compétence", 2500, 1), 10));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut générer des membres pour se déplacer à une vitesse de 3 m", 5000, 1), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut lancer un sort de niveau 3, 1/jour", 6000, 1), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut lancer un sort de niveau 2, 3/jour", 7200, 1), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet a 10 rangs dans une compétence", 10000, 2), 10));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut adopter une forme différente de la même taille", 10000, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut voler (comme avec vol), à une vitesse de 9 m", 1000, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut lancer un sort de niveau 4, 1/jour", 11200, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut se téléporter (comme avec téléportation), 1/jour", 15000, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut lancer un sort de niveau 3, 3/jour", 18000, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L’objet peut lancer un sort de niveau 4, 3/jour", 33600, 2), 5));

		return res;
	}
	
	//Tableau pour determiner les desseins de l'objet 
	public static Data<SmartItemPlan> planList(){
		Data<SmartItemPlan> res = new Data<SmartItemPlan>();
		
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer les individus d’alignement diamétralement opposé", 2), 20));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer les lanceurs de sorts profanes (y compris les monstres capables de lancer des sorts ou d’utiliser des pouvoirs magiques)", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer les lanceurs de sorts divins (y compris les entités divines et leurs serviteurs)", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer toutes les créatures qui ne savent pas lancer de sorts", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer un type particulier de créature", 2), 5));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer une race ou une espèce de créature", 2), 5));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Défendre une race ou une espèce particulière de créature", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer les serviteurs d’une divinité particulière", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Défendre les serviteurs et les intérêts d’une divinité particulière", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer tout le monde (sauf l’objet et son propriétaire)", 2), 5));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Choisissez un dessein", 2), 5));
		
		return res;
	}
	
	//Tableau pour determiner les pouvoirs de desseins de l'objet 
	public static Data<SmartItemDedicatePower> dedicatePowerList(){
		Data<SmartItemDedicatePower> res = new Data<SmartItemDedicatePower>();
		
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L’objet peut détecter les ennemis de son dessein à 18 m",10000, 1), 20));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L’objet peut utiliser un sort de niveau 4, à volonté",56000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("Le propriétaire gagne un bonus de chance de +2 aux jets d’attaque, de sauvegarde et aux tests",80000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L’objet peut lancer un sort de niveau 5, à volonté",90000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L’objet peut lancer un sort de niveau 6, à volonté",132000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L’objet peut lancer un sort de niveau 7, à volonté",182000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L’objet peut lancer résurrection suprême sur son propriétaire, 1/mois",200000, 2), 5));
		
		return res;
	}
	
	//Tableau pour determiner les traits de l'objet 
	public static Data<String> traitList(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("Toujours d’accord avec tout le monde et change tout le temps d’avis", 1));
		res.add(new Tuple<String, Integer>("Très bruyant en présence de trésors", 1));
		res.add(new Tuple<String, Integer>("Agit de façon mystérieuse et répond toujours avec poésie", 1));
		res.add(new Tuple<String, Integer>("N’aime pas les inconnus", 1));
		res.add(new Tuple<String, Integer>("Aime parier par principe sur des choses anodines", 1));
		res.add(new Tuple<String, Integer>("Parle de lui à la troisième personne", 1));
		res.add(new Tuple<String, Integer>("Négocie l’utilisation de certains de ses pouvoirs", 1));
		res.add(new Tuple<String, Integer>("Demande toujours quel est le goût et l’odeur des choses", 1));
		res.add(new Tuple<String, Integer>("Se met à hurler dès qu’il est excité", 1));
		res.add(new Tuple<String, Integer>("Monsieur je-sais-tout", 1));
		res.add(new Tuple<String, Integer>("Poli mais visiblement hypocrite", 1));
		res.add(new Tuple<String, Integer>("Tic verbal : s’excuse tout le temps", 1));
		res.add(new Tuple<String, Integer>("Lance beaucoup de menaces en l’air", 1));
		res.add(new Tuple<String, Integer>("Très suave, conseille aux gens d’aborder le succès comme l’échec avec philosophie", 1));
		res.add(new Tuple<String, Integer>("Parle aussi peu que possible", 1));
		res.add(new Tuple<String, Integer>("Ricane ou éclate de rire devant le malheur des autres", 1));
		res.add(new Tuple<String, Integer>("Se trompe systématiquement de nom quand il parle à quelqu’un", 1));
		res.add(new Tuple<String, Integer>("Prie tout le temps", 1));
		res.add(new Tuple<String, Integer>("Félicite toujours tout le monde, même pour de petites choses", 1));
		res.add(new Tuple<String, Integer>("Toujours surpris et légèrement offensé quand on s’adresse à lui", 1));
		res.add(new Tuple<String, Integer>("N’aime pas prendre de décision", 1));
		res.add(new Tuple<String, Integer>("A une liste de règles ou de maximes pour diverses situations et les cite dès que l’occasion se présente", 1));
		res.add(new Tuple<String, Integer>("Explique aux gens les raisons « réelles » de leurs actes", 1));
		res.add(new Tuple<String, Integer>("Demande des avis ou des opinions sur des situations hautement improbables", 1));
		res.add(new Tuple<String, Integer>("Utilise un langage très formel, n’emploie jamais de contractions et privilégie les mots grandiloquents", 1));
		res.add(new Tuple<String, Integer>("Se laisse facilement distraire par des événements mineurs", 1));
		res.add(new Tuple<String, Integer>("A toujours besoin de quelqu’un pour lui expliquer les blagues ou les métaphores", 1));
		res.add(new Tuple<String, Integer>("A une croyance particulière, plutôt étrange, et regarde le monde à la lumière de cette opinion", 1));
		res.add(new Tuple<String, Integer>("Aime compter les choses et adore les nombres", 1));
		res.add(new Tuple<String, Integer>("Essaye toujours de trouve un compromis", 1));
		res.add(new Tuple<String, Integer>("Toujours en train de se parler à lui-même", 1));
		res.add(new Tuple<String, Integer>("Très mauvais menteur", 1));
		res.add(new Tuple<String, Integer>("Pose des questions impolies sans se rendre compte qu’il offense son interlocuteur", 1));
		res.add(new Tuple<String, Integer>("Grommelle et se plaint de sa forme et des risques qu’il prend", 1));
		res.add(new Tuple<String, Integer>("Très sensible à la critique ou aux conflits", 1));
		res.add(new Tuple<String, Integer>("Étourdi", 1));
		res.add(new Tuple<String, Integer>("Accuse un certain type de créature d’être à l’origine de ses ennuis", 1));
		res.add(new Tuple<String, Integer>("Tyran intellectuel", 1));
		res.add(new Tuple<String, Integer>("Fait des allusions à des événements historiques ou mythologiques sans les expliquer", 1));
		res.add(new Tuple<String, Integer>("Déteste un type d’environnement et se plaint dès qu’il s’y trouve", 1));
		res.add(new Tuple<String, Integer>("Pose tout le temps des questions sur ce qui se trouve en dehors de son champ de vision", 1));
		res.add(new Tuple<String, Integer>("Fait tous les jours une liste de ce que son propriétaire doit faire", 1));
		res.add(new Tuple<String, Integer>("Incapable de garder un secret", 1));
		res.add(new Tuple<String, Integer>("Légèrement surpris quand quelqu’un a une bonne idée ou fait quelque chose de productif", 1));
		res.add(new Tuple<String, Integer>("Pleurniche tout le temps", 1));
		res.add(new Tuple<String, Integer>("Se met facilement en colère", 1));
		res.add(new Tuple<String, Integer>("Lance sans cesse des avertissements sur les dangers des maladies", 1));
		res.add(new Tuple<String, Integer>("A une phrase fétiche", 1));
		res.add(new Tuple<String, Integer>("Murmure un mot qui rime avec le dernier mot de la phrase", 1));
		res.add(new Tuple<String, Integer>("Adore les jeux de mots", 1));
		res.add(new Tuple<String, Integer>("Fait des bruits d’animaux quand il est excité ou se sent menacé", 1));
		res.add(new Tuple<String, Integer>("Amoureux de poésie et de littérature, il ne rate jamais une occasion de faire une tirade ou deux, en vers ou en prose", 1));
		res.add(new Tuple<String, Integer>("Très superstitieux", 1));
		res.add(new Tuple<String, Integer>("Pousse son propriétaire à agir de manière téméraire", 1));
		res.add(new Tuple<String, Integer>("N’utilise jamais un seul mot quand il peut en placer dix", 1));
		res.add(new Tuple<String, Integer>("Demande sans cesse qu’on le détruise mais panique si on le prend au sérieux", 1));
		res.add(new Tuple<String, Integer>("A toujours une bonne explication pour signifier que quelque chose ne marchera pas", 1));
		res.add(new Tuple<String, Integer>("Prétend être amoureux de son propriétaire", 1));
		res.add(new Tuple<String, Integer>("Raconte des histoires ennuyeuses à propos de choses banales", 1));
		res.add(new Tuple<String, Integer>("A toujours des suggestions à faire pour rendre les choses « plus drôles et plus intéressantes »", 1));
		res.add(new Tuple<String, Integer>("Apprend des mots dans des langues qu’il ne connaît pas et les utilise à la place de mots sa langue principale", 1));
		res.add(new Tuple<String, Integer>("Adore son propriétaire", 1));
		res.add(new Tuple<String, Integer>("Ignore souvent son propriétaire", 1));
		res.add(new Tuple<String, Integer>("Se méprise", 1));
		res.add(new Tuple<String, Integer>("Chante parfois des comptines exaspérantes", 1));
		res.add(new Tuple<String, Integer>("Se comporte comme si son propriétaire était son ami mais, à l’évidence, il le déteste", 1));
		res.add(new Tuple<String, Integer>("Méprise ouvertement les religions organisées et pense que tous les dieux sont des menteurs égoïstes", 1));
		res.add(new Tuple<String, Integer>("De plus en plus furieux et déterminé à chaque revers de fortune", 1));
		res.add(new Tuple<String, Integer>("Croit que la plupart des objets sont intelligents", 1));
		res.add(new Tuple<String, Integer>("N’a aucune échelle de valeur morale quand il dresse des plans et propose souvent des solutions horrifiantes à des problèmes mineurs", 1));
		res.add(new Tuple<String, Integer>("Reste muet et refuse de parler à qui que ce soit pendant des jours", 1));
		res.add(new Tuple<String, Integer>("Croit qu’il devient fou", 1));
		res.add(new Tuple<String, Integer>("Cite constamment le nom d’un de ses anciens propriétaires qui était très célèbre", 1));
		res.add(new Tuple<String, Integer>("A une syntaxe et une diction catastrophiques", 1));
		res.add(new Tuple<String, Integer>("N’en a jamais assez d’apprendre de nouvelles choses", 1));
		res.add(new Tuple<String, Integer>("Se plaint d’odeurs que personne d’autres ne remarque", 1));
		res.add(new Tuple<String, Integer>("Veut qu’on le trempe dans de la bière, du vin ou un autre alcool et se comporte ensuite comme s’il était saoul", 1));
		res.add(new Tuple<String, Integer>("Adore chanter mais n’a absolument pas l’oreille musicale", 1));
		res.add(new Tuple<String, Integer>("Tient les autres pour responsables de ses malheurs", 1));
		res.add(new Tuple<String, Integer>("Intarissable moulin à rumeurs qui invente la plupart des détails", 1));
		res.add(new Tuple<String, Integer>("Considère les autres comme des êtres à l’intelligence inférieure", 1));
		res.add(new Tuple<String, Integer>("Toujours enjoué, tente de remonter le moral d’autrui avec des chants, des blagues et des histoires passionnantes", 1));
		res.add(new Tuple<String, Integer>("Plus les choses empirent, plus il est détendu, et vice-versa", 1));
		res.add(new Tuple<String, Integer>("Se souvient toujours de travers", 1));
		res.add(new Tuple<String, Integer>("Invente des histoires", 1));
		res.add(new Tuple<String, Integer>("Évite de parler à quelqu’un d’autre que son propriétaire", 1));
		res.add(new Tuple<String, Integer>("A toujours besoin d’attention", 1));
		res.add(new Tuple<String, Integer>("Est un peu perturbé quand il n’est pas avec son propriétaire", 1));
		res.add(new Tuple<String, Integer>("Interroge les autres sur leur passé, pour savoir s’ils « conviennent »", 1));
		res.add(new Tuple<String, Integer>("Est perplexe quant aux actions d’autrui et demande souvent une explication à leurs actes", 1));
		res.add(new Tuple<String, Integer>("Très jaloux et très possessif vis à vis de son propriétaire", 1));
		res.add(new Tuple<String, Integer>("Mentionne sans cesse une bataille à laquelle il a participé et dit que rien n’est comparable", 1));
		res.add(new Tuple<String, Integer>("Diagnostique une manie, une obsession ou une malédiction chez tout le monde mais se trompe souvent", 1));
		res.add(new Tuple<String, Integer>("Explique des choses simples qui n’ont pas besoin d’explication", 1));
		res.add(new Tuple<String, Integer>("Voudrait être libéré de son enveloppe d’objet et cherche quelqu’un pour accomplir cette tâche", 1));
		res.add(new Tuple<String, Integer>("Pense être un dieu emprisonné", 1));
		res.add(new Tuple<String, Integer>("A un ami éthéré imaginaire", 1));
		res.add(new Tuple<String, Integer>("A peur du noir", 1));
		res.add(new Tuple<String, Integer>("Sermonne les gens qui disent des insanités", 1));
		res.add(new Tuple<String, Integer>("Parle peu mais émet souvent des petits ricanements déments", 1));
		
		return res;
	}
}



