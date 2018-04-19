package datamodel;

public class DeductiveMiniPattern extends PatternTest {
	PatternComponent leaf1;
	PatternComponent leaf2;
	PatternComponent leaf3;
	PatternComponent leaf4;
	PatternComponent leaf5;
	PatternComponent leaf6;
	PatternComponent container;

	public DeductiveMiniPattern() {
		container = new PatternComposite(PATTERN_NAME_DEDUCTIVE);
		leaf1 = new PatternPart(PART_TITLE_NAME, "ena");
		leaf2 = new PatternPart(PART_TITLE_TEMPLATE, "dio");
		leaf3 = new PatternPart(PART_TITLE_PROBLEM, "tria");
		leaf4 = new PatternPart(PART_TITLE_SOLUTION, "tessera");
		leaf5 = new PatternPart(PART_TITLE_BENEFIT, "pente");
		leaf6 = new PatternPart(PART_TITLE_CONSEQUENCES, "exi");
		doAddCool();
	}

	public DeductiveMiniPattern(DeductiveMiniPattern deductiveMiniPattern) {
		this.container = new PatternComposite(deductiveMiniPattern.container.getTitle());
		this.leaf1 = new PatternPart(deductiveMiniPattern.leaf1.getTitle(), deductiveMiniPattern.leaf1.getContents());
		this.leaf2 = new PatternPart(deductiveMiniPattern.leaf2.getTitle(), deductiveMiniPattern.leaf2.getContents());
		this.leaf3 = new PatternPart(deductiveMiniPattern.leaf3.getTitle(), deductiveMiniPattern.leaf3.getContents());
		this.leaf4 = new PatternPart(deductiveMiniPattern.leaf4.getTitle(), deductiveMiniPattern.leaf4.getContents());
		this.leaf5 = new PatternPart(deductiveMiniPattern.leaf5.getTitle(), deductiveMiniPattern.leaf5.getContents());
		this.leaf6 = new PatternPart(deductiveMiniPattern.leaf6.getTitle(), deductiveMiniPattern.leaf6.getContents());
		doAddCool();
	}

	public void doAddCool() {
		container.add(container);
		container.add(leaf1);
		container.add(leaf2);
		container.add(leaf3);
		container.add(leaf4);
		container.add(leaf5);
		container.add(leaf6);
	}

	@Override
	public PatternTest clone() {
		return new DeductiveMiniPattern(this);
	}
}