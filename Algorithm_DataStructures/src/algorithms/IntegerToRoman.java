package algorithms;

public class IntegerToRoman {
	public String intToRoman(int num) {
		int quot = 0;
		int rem = 0;
		int divider = 0;
		StringBuffer sb = new StringBuffer();
		if (num > 0 && num < 4000) {
			if (num < 4000 && num >= 1000) {
				divider = 1000;
				quot = num / divider;
				rem = num % divider;
				if (rem == 0) {
					if (quot == 1) {
						return sb.append("M").toString();
					} else if (quot == 2) {
						return sb.append("MM").toString();
					} else {
						return sb.append("MMM").toString();
					}
				} else {
					if (quot == 1) {
						sb.append("M").toString();
					} else if (quot == 2) {
						sb.append("MM").toString();
					} else {
						sb.append("MMM").toString();
					}
					divider = 100;
					quot = rem / divider;
					rem = rem % divider;
					if (rem == 0) {
						if (quot == 1) {
							return sb.append("C").toString();
						} else if (quot == 2) {
							return sb.append("CC").toString();
						} else if (quot == 3) {
							return sb.append("CCC").toString();
						} else if (quot == 4) {
							return sb.append("CD").toString();
						} else if (quot == 5) {
							return sb.append("D").toString();
						} else if (quot == 6) {
							return sb.append("DC").toString();
						} else if (quot == 7) {
							return sb.append("DCC").toString();
						} else if (quot == 8) {
							return sb.append("DCCC").toString();
						} else if (quot == 9) {
							return sb.append("CM").toString();
						}
					} else {
						if (quot == 1) {
							sb.append("C").toString();
						} else if (quot == 2) {
							sb.append("CC").toString();
						} else if (quot == 3) {
							sb.append("CCC").toString();
						} else if (quot == 4) {
							sb.append("CD").toString();
						} else if (quot == 5) {
							sb.append("D").toString();
						} else if (quot == 6) {
							sb.append("DC").toString();
						} else if (quot == 7) {
							sb.append("DCC").toString();
						} else if (quot == 8) {
							sb.append("DCCC").toString();
						} else if (quot == 9) {
							sb.append("CM");
						}
					}
					divider = 10;
					quot = rem / divider;
					rem = rem % divider;

					if (rem == 0) {
						if (quot == 1) {
							return sb.append("X").toString();
						} else if (quot == 2) {
							return sb.append("XX").toString();
						} else if (quot == 3) {
							return sb.append("XXX").toString();
						} else if (quot == 4) {
							return sb.append("XL").toString();
						} else if (quot == 5) {
							return sb.append("L").toString();
						} else if (quot == 6) {
							return sb.append("LX").toString();
						} else if (quot == 7) {
							return sb.append("LXX").toString();
						} else if (quot == 8) {
							return sb.append("LXXX").toString();
						} else if (quot == 9) {
							return sb.append("XC").toString();
						}
					} else {
						if (quot == 1) {
							sb.append("X").toString();
						} else if (quot == 2) {
							sb.append("XX").toString();
						} else if (quot == 3) {
							sb.append("XXX").toString();
						} else if (quot == 4) {
							sb.append("XL").toString();
						} else if (quot == 5) {
							sb.append("L").toString();
						} else if (quot == 6) {
							sb.append("LX").toString();
						} else if (quot == 7) {
							sb.append("LXX").toString();
						} else if (quot == 8) {
							sb.append("LXXX").toString();
						} else if (quot == 9) {
							sb.append("XC").toString();
						}
					}

					if (rem == 1) {
						return sb.append("I").toString();
					} else if (rem == 2) {
						return sb.append("II").toString();
					} else if (rem == 3) {
						return sb.append("III").toString();
					} else if (rem == 4) {
						return sb.append("IV").toString();
					} else if (rem == 5) {
						return sb.append("V").toString();
					} else if (rem == 6) {
						return sb.append("VI").toString();
					} else if (rem == 7) {
						return sb.append("VII").toString();
					} else if (rem == 8) {
						return sb.append("VIII").toString();
					} else if (rem == 9) {
						return sb.append("IX").toString();
					}
				}

			} else if (num < 1000 && num >= 100) {
				divider = 100;
				quot = num / divider;
				rem = num % divider;
				if (rem == 0) {
					if (quot == 1) {
						return sb.append("C").toString();
					} else if (quot == 2) {
						return sb.append("CC").toString();
					} else if (quot == 3) {
						return sb.append("CCC").toString();
					} else if (quot == 4) {
						return sb.append("CD").toString();
					} else if (quot == 5) {
						return sb.append("D").toString();
					} else if (quot == 6) {
						return sb.append("DC").toString();
					} else if (quot == 7) {
						return sb.append("DCC").toString();
					} else if (quot == 8) {
						return sb.append("DCCC").toString();
					} else if (quot == 9) {
						return sb.append("CM").toString();
					}
				} else {
					if (quot == 1) {
						sb.append("C").toString();
					} else if (quot == 2) {
						sb.append("CC").toString();
					} else if (quot == 3) {
						sb.append("CCC").toString();
					} else if (quot == 4) {
						sb.append("CD").toString();
					} else if (quot == 5) {
						sb.append("D").toString();
					} else if (quot == 6) {
						sb.append("DC").toString();
					} else if (quot == 7) {
						sb.append("DCC").toString();
					} else if (quot == 8) {
						sb.append("DCCC").toString();
					} else if (quot == 9) {
						sb.append("CM");
					}
				}
				divider = 10;
				quot = rem / divider;
				rem = rem % divider;

				if (rem == 0) {
					if (quot == 1) {
						return sb.append("X").toString();
					} else if (quot == 2) {
						return sb.append("XX").toString();
					} else if (quot == 3) {
						return sb.append("XXX").toString();
					} else if (quot == 4) {
						return sb.append("XL").toString();
					} else if (quot == 5) {
						return sb.append("L").toString();
					} else if (quot == 6) {
						return sb.append("LX").toString();
					} else if (quot == 7) {
						return sb.append("LXX").toString();
					} else if (quot == 8) {
						return sb.append("LXXX").toString();
					} else if (quot == 9) {
						return sb.append("XC").toString();
					}
				} else {
					if (quot == 1) {
						sb.append("X").toString();
					} else if (quot == 2) {
						sb.append("XX").toString();
					} else if (quot == 3) {
						sb.append("XXX").toString();
					} else if (quot == 4) {
						sb.append("XL").toString();
					} else if (quot == 5) {
						sb.append("L").toString();
					} else if (quot == 6) {
						sb.append("LX").toString();
					} else if (quot == 7) {
						sb.append("LXX").toString();
					} else if (quot == 8) {
						sb.append("LXXX").toString();
					} else if (quot == 9) {
						sb.append("XC").toString();
					}
				}

				if (rem == 1) {
					return sb.append("I").toString();
				} else if (rem == 2) {
					return sb.append("II").toString();
				} else if (rem == 3) {
					return sb.append("III").toString();
				} else if (rem == 4) {
					return sb.append("IV").toString();
				} else if (rem == 5) {
					return sb.append("V").toString();
				} else if (rem == 6) {
					return sb.append("VI").toString();
				} else if (rem == 7) {
					return sb.append("VII").toString();
				} else if (rem == 8) {
					return sb.append("VIII").toString();
				} else if (rem == 9) {
					return sb.append("IX").toString();
				}

			} else if (num < 100 && num >= 10) {
				divider = 10;
				quot = num / divider;
				rem = num % divider;
				System.out.println(quot);
				System.out.println(rem);
				if (rem == 0) {
					if (quot == 1) {
						return sb.append("X").toString();
					} else if (quot == 2) {
						return sb.append("XX").toString();
					} else if (quot == 3) {
						return sb.append("XXX").toString();
					} else if (quot == 4) {
						return sb.append("XL").toString();
					} else if (quot == 5) {
						return sb.append("L").toString();
					} else if (quot == 6) {
						return sb.append("LX").toString();
					} else if (quot == 7) {
						return sb.append("LXX").toString();
					} else if (quot == 8) {
						return sb.append("LXXX").toString();
					} else if (quot == 9) {
						return sb.append("XC").toString();
					}
				} else {
					if (quot == 1) {
						sb.append("X").toString();
					} else if (quot == 2) {
						sb.append("XX").toString();
					} else if (quot == 3) {
						sb.append("XXX").toString();
					} else if (quot == 4) {
						sb.append("XL").toString();
					} else if (quot == 5) {
						sb.append("L").toString();
					} else if (quot == 6) {
						sb.append("LX").toString();
					} else if (quot == 7) {
						sb.append("LXX").toString();
					} else if (quot == 8) {
						sb.append("LXXX").toString();
					} else if (quot == 9) {
						sb.append("XC").toString();
					}
				}

				if (rem == 1) {
					return sb.append("I").toString();
				} else if (rem == 2) {
					return sb.append("II").toString();
				} else if (rem == 3) {
					return sb.append("III").toString();
				} else if (rem == 4) {
					return sb.append("IV").toString();
				} else if (rem == 5) {
					return sb.append("V").toString();
				} else if (rem == 6) {
					return sb.append("VI").toString();
				} else if (rem == 7) {
					return sb.append("VII").toString();
				} else if (rem == 8) {
					return sb.append("VIII").toString();
				} else if (rem == 9) {
					return sb.append("IX").toString();
				}
			} else if (num < 10 && num > 0) {
				if (num == 1) {
					return sb.append("I").toString();
				} else if (num == 2) {
					return sb.append("II").toString();
				} else if (num == 3) {
					return sb.append("III").toString();
				} else if (num == 4) {
					return sb.append("IV").toString();
				} else if (num == 5) {
					return sb.append("V").toString();
				} else if (num == 6) {
					return sb.append("VI").toString();
				} else if (num == 7) {
					return sb.append("VII").toString();
				} else if (num == 8) {
					return sb.append("VIII").toString();
				} else if (num == 9) {
					return sb.append("IX").toString();
				}
			}
		} else {
			return " ";
		}
		return " ";
	}

	public static void main(String[] args) {
		IntegerToRoman i = new IntegerToRoman();
		System.out.println("Res: " + i.another(1010));
	}
	
 public String another(int num) {
	        String M[] = {"", "M", "MM", "MMM"};
	        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
	    }
}
