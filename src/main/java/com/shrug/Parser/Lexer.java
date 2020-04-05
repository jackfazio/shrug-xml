// DO NOT EDIT
// Generated by JFlex 1.8.1 http://jflex.de/
// source: shrug.flex

package com.shrug.Parser;

import java.io.*;
import com.shrug.AST.*;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\41\u1f00\1\u0100\1\u2f00\1\u3000\1\u0100\1\u3100\1\u3200"+
    "\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u0100"+
    "\1\u3a00\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u1f00"+
    "\1\u4100\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800"+
    "\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u1f00\1\u4d00\1\u4e00\1\u4f00"+
    "\1\u5000\3\u0100\1\u5100\1\u5200\1\u5300\12\u1f00\4\u0100\1\u5400"+
    "\17\u1f00\2\u0100\1\u5500\41\u1f00\2\u0100\1\u5600\1\u5700\2\u1f00"+
    "\1\u5800\1\u5900\27\u0100\1\u5a00\2\u0100\1\u5b00\45\u1f00\1\u0100"+
    "\1\u5c00\1\u5d00\11\u1f00\1\u5e00\24\u1f00\1\u5f00\1\u6000\1\u1f00"+
    "\1\u6100\1\u6200\1\u6300\1\u6400\2\u1f00\1\u6500\5\u1f00\1\u6600"+
    "\1\u6700\1\u6800\5\u1f00\1\u6900\1\u6a00\2\u1f00\1\u6b00\1\u1f00"+
    "\1\u6c00\21\u1f00\246\u0100\1\u6d00\20\u0100\1\u6e00\1\u6f00\25\u0100"+
    "\1\u7000\34\u0100\1\u7100\14\u1f00\2\u0100\1\u7200\u0b05\u1f00\1\u7300"+
    "\1\u7400\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\16\0\4\3"+
    "\1\1\3\3\1\5\2\3\1\6\1\7\1\10\2\3"+
    "\1\11\3\3\12\0\7\3\32\5\4\3\1\5\1\3"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\2\5\1\23\1\5\1\24\1\25\2\5\1\26"+
    "\1\27\1\30\1\31\5\5\4\3\41\0\2\3\4\5"+
    "\4\3\1\5\2\3\1\0\7\3\1\5\4\3\1\5"+
    "\5\3\27\5\1\3\37\5\1\3\u01ca\5\4\3\14\5"+
    "\16\3\5\5\7\3\1\5\1\3\1\5\21\3\160\0"+
    "\5\5\1\3\2\5\2\3\4\5\1\3\1\5\6\3"+
    "\1\5\1\3\3\5\1\3\1\5\1\3\24\5\1\3"+
    "\123\5\1\3\213\5\1\3\5\0\2\3\246\5\1\3"+
    "\46\5\2\3\1\5\6\3\51\5\6\3\1\5\1\3"+
    "\55\0\1\3\1\0\1\3\2\0\1\3\2\0\1\3"+
    "\1\0\10\3\33\5\4\3\4\5\15\3\6\0\5\3"+
    "\1\5\4\3\13\0\1\3\1\0\3\3\53\5\37\0"+
    "\4\3\2\5\1\0\143\5\1\3\1\5\10\0\1\3"+
    "\6\0\2\5\2\0\1\3\4\0\2\5\12\0\3\5"+
    "\2\3\1\5\17\3\1\0\1\5\1\0\36\5\33\0"+
    "\2\3\131\5\13\0\1\5\16\3\12\0\41\5\11\0"+
    "\2\5\4\3\1\5\2\3\1\0\30\5\4\0\1\5"+
    "\11\0\1\5\3\0\1\5\5\0\22\3\31\5\3\0"+
    "\4\3\13\5\65\3\25\5\1\3\10\5\25\3\61\0"+
    "\66\5\3\0\1\5\22\0\1\5\7\0\12\5\2\0"+
    "\2\3\12\0\1\3\20\5\3\0\1\3\10\5\2\3"+
    "\2\5\2\3\26\5\1\3\7\5\1\3\1\5\3\3"+
    "\4\5\2\3\1\0\1\5\7\0\2\3\2\0\2\3"+
    "\3\0\1\5\10\3\1\0\4\3\2\5\1\3\3\5"+
    "\2\0\2\3\12\0\4\5\7\3\2\5\1\3\1\0"+
    "\2\3\3\0\1\3\6\5\4\3\2\5\2\3\26\5"+
    "\1\3\7\5\1\3\2\5\1\3\2\5\1\3\2\5"+
    "\2\3\1\0\1\3\5\0\4\3\2\0\2\3\3\0"+
    "\3\3\1\0\7\3\4\5\1\3\1\5\7\3\14\0"+
    "\3\5\1\0\13\3\3\0\1\3\11\5\1\3\3\5"+
    "\1\3\26\5\1\3\7\5\1\3\2\5\1\3\5\5"+
    "\2\3\1\0\1\5\10\0\1\3\3\0\1\3\3\0"+
    "\2\3\1\5\17\3\2\5\2\0\2\3\12\0\1\3"+
    "\1\5\7\3\1\5\6\0\1\3\3\0\1\3\10\5"+
    "\2\3\2\5\2\3\26\5\1\3\7\5\1\3\2\5"+
    "\1\3\5\5\2\3\1\0\1\5\7\0\2\3\2\0"+
    "\2\3\3\0\10\3\2\0\4\3\2\5\1\3\3\5"+
    "\2\0\2\3\12\0\1\3\1\5\20\3\1\0\1\5"+
    "\1\3\6\5\3\3\3\5\1\3\4\5\3\3\2\5"+
    "\1\3\1\5\1\3\2\5\3\3\2\5\3\3\3\5"+
    "\3\3\14\5\4\3\5\0\3\3\3\0\1\3\4\0"+
    "\2\3\1\5\6\3\1\0\16\3\12\0\11\3\1\5"+
    "\6\3\5\0\10\5\1\3\3\5\1\3\27\5\1\3"+
    "\20\5\3\3\1\5\7\0\1\3\3\0\1\3\4\0"+
    "\7\3\2\0\1\3\3\5\5\3\2\5\2\0\2\3"+
    "\12\0\20\3\1\5\3\0\1\3\10\5\1\3\3\5"+
    "\1\3\27\5\1\3\12\5\1\3\5\5\2\3\1\0"+
    "\1\5\7\0\1\3\3\0\1\3\4\0\7\3\2\0"+
    "\7\3\1\5\1\3\2\5\2\0\2\3\12\0\1\3"+
    "\2\5\15\3\4\0\1\3\10\5\1\3\3\5\1\3"+
    "\51\5\2\0\1\5\7\0\1\3\3\0\1\3\4\0"+
    "\1\5\5\3\3\5\1\0\7\3\3\5\2\0\2\3"+
    "\12\0\12\3\6\5\2\3\2\0\1\3\22\5\3\3"+
    "\30\5\1\3\11\5\1\3\1\5\2\3\7\5\3\3"+
    "\1\0\4\3\6\0\1\3\1\0\1\3\10\0\6\3"+
    "\12\0\2\3\2\0\15\3\60\5\1\0\2\5\7\0"+
    "\4\3\10\5\10\0\1\3\12\0\47\3\2\5\1\3"+
    "\1\5\1\3\5\5\1\3\30\5\1\3\1\5\1\3"+
    "\12\5\1\0\2\5\11\0\1\5\2\3\5\5\1\3"+
    "\1\5\1\3\6\0\2\3\12\0\2\3\4\5\40\3"+
    "\1\5\27\3\2\0\6\3\12\0\13\3\1\0\1\3"+
    "\1\0\1\3\1\0\4\3\2\0\10\5\1\3\44\5"+
    "\4\3\24\0\1\3\2\0\5\5\13\0\1\3\44\0"+
    "\11\3\1\0\71\3\53\5\24\0\1\5\12\0\6\3"+
    "\6\5\4\0\4\5\3\0\1\5\3\0\2\5\7\0"+
    "\3\5\4\0\15\5\14\0\1\5\17\0\2\3\46\5"+
    "\1\3\1\5\5\3\1\5\2\3\53\5\1\3\115\5"+
    "\1\3\4\5\2\3\7\5\1\3\1\5\1\3\4\5"+
    "\2\3\51\5\1\3\4\5\2\3\41\5\1\3\4\5"+
    "\2\3\7\5\1\3\1\5\1\3\4\5\2\3\17\5"+
    "\1\3\71\5\1\3\4\5\2\3\103\5\2\3\3\0"+
    "\40\3\20\5\20\3\126\5\2\3\6\5\3\3\u016c\5"+
    "\2\3\21\5\1\3\32\5\5\3\113\5\3\3\13\5"+
    "\7\3\15\5\1\3\4\5\3\0\13\3\22\5\3\0"+
    "\13\3\22\5\2\0\14\3\15\5\1\3\3\5\1\3"+
    "\2\0\14\3\64\5\40\0\3\3\1\5\3\3\2\5"+
    "\1\0\2\3\12\0\41\3\4\0\1\3\12\0\6\3"+
    "\131\5\7\3\5\5\2\0\42\5\1\0\1\5\5\3"+
    "\106\5\12\3\37\5\1\3\14\0\4\3\14\0\12\3"+
    "\12\0\36\5\2\3\5\5\13\3\54\5\4\3\32\5"+
    "\6\3\12\0\46\3\27\5\5\0\4\3\65\5\12\0"+
    "\1\3\35\0\2\3\13\0\6\3\12\0\15\3\1\5"+
    "\10\3\16\0\102\3\5\0\57\5\21\0\7\5\4\3"+
    "\12\0\21\3\11\0\14\3\3\0\36\5\15\0\2\5"+
    "\12\0\54\5\16\0\14\3\44\5\24\0\10\3\12\0"+
    "\3\3\3\5\12\0\44\5\2\3\11\5\7\3\53\5"+
    "\2\3\3\5\20\3\3\0\1\3\25\0\4\5\1\0"+
    "\6\5\1\0\2\5\3\0\1\5\5\3\300\5\72\0"+
    "\1\3\5\0\26\5\2\3\6\5\2\3\46\5\2\3"+
    "\6\5\2\3\10\5\1\3\1\5\1\3\1\5\1\3"+
    "\1\5\1\3\37\5\2\3\65\5\1\3\7\5\1\3"+
    "\1\5\3\3\3\5\1\3\7\5\3\3\4\5\2\3"+
    "\6\5\4\3\15\5\5\3\3\5\1\3\7\5\16\3"+
    "\5\0\32\3\5\0\20\3\2\5\23\3\1\5\13\3"+
    "\5\0\1\3\12\0\1\3\1\5\15\3\1\5\20\3"+
    "\15\5\3\3\40\5\20\3\15\0\4\3\1\0\3\3"+
    "\14\0\21\3\1\5\4\3\1\5\2\3\12\5\1\3"+
    "\1\5\3\3\5\5\6\3\1\5\1\3\1\5\1\3"+
    "\1\5\1\3\4\5\1\3\13\5\2\3\4\5\5\3"+
    "\5\5\4\3\1\5\21\3\51\5\u0177\3\57\5\1\3"+
    "\57\5\1\3\205\5\6\3\4\5\3\0\2\5\14\3"+
    "\46\5\1\3\1\5\5\3\1\5\2\3\70\5\7\3"+
    "\1\5\17\3\1\0\27\5\11\3\7\5\1\3\7\5"+
    "\1\3\7\5\1\3\7\5\1\3\7\5\1\3\7\5"+
    "\1\3\7\5\1\3\7\5\1\3\40\0\57\3\1\5"+
    "\325\3\3\5\31\3\11\5\6\0\1\3\5\5\2\3"+
    "\5\5\4\3\126\5\2\3\2\0\2\3\3\5\1\3"+
    "\132\5\1\3\4\5\5\3\53\5\1\3\136\5\21\3"+
    "\33\5\65\3\306\5\112\3\360\5\20\3\215\5\103\3"+
    "\56\5\2\3\15\5\3\3\20\5\12\0\2\5\24\3"+
    "\57\5\1\0\4\3\12\0\1\3\37\5\2\0\120\5"+
    "\2\0\45\3\11\5\2\3\147\5\2\3\65\5\2\3"+
    "\5\5\60\3\13\5\1\0\3\5\1\0\4\5\1\0"+
    "\27\5\5\0\20\3\1\5\7\3\64\5\14\3\2\0"+
    "\62\5\22\0\12\3\12\0\6\3\22\0\6\5\3\3"+
    "\1\5\1\3\2\5\13\0\34\5\10\0\2\3\27\5"+
    "\15\0\14\3\35\5\3\3\4\0\57\5\16\0\16\3"+
    "\1\5\12\0\6\3\5\5\1\0\12\5\12\0\5\5"+
    "\1\3\51\5\16\0\11\3\3\5\1\0\10\5\2\0"+
    "\2\3\12\0\6\3\27\5\3\3\1\5\3\0\62\5"+
    "\1\0\1\5\3\0\2\5\2\0\5\5\2\0\1\5"+
    "\1\0\1\5\30\3\3\5\2\3\13\5\5\0\2\3"+
    "\3\5\2\0\12\3\6\5\2\3\6\5\2\3\6\5"+
    "\11\3\7\5\1\3\7\5\1\3\53\5\1\3\14\5"+
    "\10\3\163\5\10\0\1\3\2\0\2\3\12\0\6\3"+
    "\244\5\14\3\27\5\4\3\61\5\4\3\156\5\2\3"+
    "\152\5\46\3\7\5\14\3\5\5\5\3\1\5\1\0"+
    "\12\5\1\3\15\5\1\3\5\5\1\3\1\5\1\3"+
    "\2\5\1\3\2\5\1\3\154\5\41\3\153\5\22\3"+
    "\100\5\2\3\66\5\50\3\15\5\3\3\20\0\20\3"+
    "\20\0\3\3\2\5\30\3\3\5\31\3\1\5\6\3"+
    "\5\5\1\3\207\5\2\3\1\0\4\3\1\5\13\3"+
    "\12\0\7\3\32\5\4\3\1\5\1\3\32\5\13\3"+
    "\131\5\3\3\6\5\2\3\6\5\2\3\6\5\2\3"+
    "\3\5\3\3\2\5\3\3\2\5\22\3\3\0\4\3"+
    "\14\5\1\3\32\5\1\3\23\5\1\3\2\5\1\3"+
    "\17\5\2\3\16\5\42\3\173\5\105\3\65\5\210\3"+
    "\1\0\202\3\35\5\3\3\61\5\17\3\1\0\37\3"+
    "\40\5\15\3\36\5\5\3\46\5\5\0\5\3\36\5"+
    "\2\3\44\5\4\3\10\5\1\3\5\5\52\3\236\5"+
    "\2\3\12\0\6\3\44\5\4\3\44\5\4\3\50\5"+
    "\10\3\64\5\234\3\67\5\11\3\26\5\12\3\10\5"+
    "\230\3\6\5\2\3\1\5\1\3\54\5\1\3\2\5"+
    "\3\3\1\5\2\3\27\5\12\3\27\5\11\3\37\5"+
    "\101\3\23\5\1\3\2\5\12\3\26\5\12\3\32\5"+
    "\106\3\70\5\6\3\2\5\100\3\1\5\3\0\1\3"+
    "\2\0\5\3\4\0\4\5\1\3\3\5\1\3\35\5"+
    "\2\3\3\0\4\3\1\0\40\3\35\5\3\3\35\5"+
    "\43\3\10\5\1\3\34\5\2\0\31\3\66\5\12\3"+
    "\26\5\12\3\23\5\15\3\22\5\156\3\111\5\67\3"+
    "\63\5\15\3\63\5\15\3\44\5\4\0\10\3\12\0"+
    "\306\3\35\5\12\3\1\5\10\3\26\5\13\0\217\3"+
    "\27\5\11\3\3\0\65\5\17\0\37\3\12\0\17\3"+
    "\4\0\55\5\13\0\2\3\1\0\17\3\1\0\2\3"+
    "\31\5\7\3\12\0\6\3\3\0\44\5\16\0\1\3"+
    "\12\0\4\3\1\5\2\0\11\3\43\5\1\0\2\3"+
    "\1\5\11\3\3\0\60\5\16\0\4\5\4\3\4\0"+
    "\3\3\12\0\1\5\1\3\1\5\43\3\22\5\1\3"+
    "\31\5\14\0\6\3\1\0\101\3\7\5\1\3\1\5"+
    "\1\3\4\5\1\3\17\5\1\3\12\5\7\3\57\5"+
    "\14\0\5\3\12\0\6\3\4\0\1\3\10\5\2\3"+
    "\2\5\2\3\26\5\1\3\7\5\1\3\2\5\1\3"+
    "\5\5\1\3\2\0\1\5\7\0\2\3\2\0\2\3"+
    "\3\0\2\3\1\5\6\3\1\0\5\3\5\5\2\0"+
    "\2\3\7\0\3\3\5\0\213\3\65\5\22\0\4\5"+
    "\5\3\12\0\4\3\1\0\1\5\40\3\60\5\24\0"+
    "\2\5\1\3\1\5\10\3\12\0\246\3\57\5\7\0"+
    "\2\3\11\0\27\3\4\5\2\0\42\3\60\5\21\0"+
    "\3\3\1\5\13\3\12\0\46\3\53\5\15\0\1\5"+
    "\7\3\12\0\66\3\33\5\2\3\17\0\4\3\12\0"+
    "\306\3\54\5\17\0\145\3\100\5\12\0\25\3\1\5"+
    "\240\3\10\5\2\3\47\5\7\0\2\3\7\0\1\5"+
    "\1\3\1\5\1\0\33\3\1\5\12\0\50\5\7\0"+
    "\1\5\4\0\10\3\1\0\10\3\1\5\13\0\56\5"+
    "\20\0\3\3\1\5\42\3\71\5\7\3\11\5\1\3"+
    "\45\5\10\0\1\3\10\0\1\5\17\3\12\0\30\3"+
    "\36\5\2\3\26\0\1\3\16\0\111\3\7\5\1\3"+
    "\2\5\1\3\46\5\6\0\3\3\1\0\1\3\2\0"+
    "\1\3\7\0\1\5\1\0\10\3\12\0\6\3\6\5"+
    "\1\3\2\5\1\3\40\5\5\0\1\3\2\0\1\3"+
    "\5\0\1\5\7\3\12\0\u0136\3\23\5\4\0\346\3"+
    "\4\5\37\3\232\5\146\3\157\5\21\3\304\5\274\3"+
    "\57\5\1\3\11\0\307\3\107\5\271\3\71\5\7\3"+
    "\37\5\1\3\12\0\146\3\36\5\2\3\5\0\13\3"+
    "\60\5\7\0\11\3\4\5\14\3\12\0\11\3\25\5"+
    "\5\3\23\5\260\3\100\5\200\3\113\5\4\3\1\0"+
    "\1\5\67\0\7\3\4\0\15\5\100\3\2\5\1\3"+
    "\1\5\34\3\370\5\10\3\363\5\15\3\37\5\61\3"+
    "\3\5\21\3\4\5\10\3\u018c\5\4\3\153\5\5\3"+
    "\15\5\3\3\11\5\7\3\12\5\3\3\2\0\1\3"+
    "\4\0\301\3\5\0\3\3\26\0\2\3\7\0\36\3"+
    "\4\0\224\3\3\0\273\3\125\5\1\3\107\5\1\3"+
    "\2\5\2\3\1\5\2\3\2\5\2\3\4\5\1\3"+
    "\14\5\1\3\1\5\1\3\7\5\1\3\101\5\1\3"+
    "\4\5\2\3\10\5\1\3\7\5\1\3\34\5\1\3"+
    "\4\5\1\3\5\5\1\3\1\5\3\3\7\5\1\3"+
    "\u0154\5\2\3\31\5\1\3\31\5\1\3\37\5\1\3"+
    "\31\5\1\3\37\5\1\3\31\5\1\3\37\5\1\3"+
    "\31\5\1\3\37\5\1\3\31\5\1\3\10\5\2\3"+
    "\151\0\4\3\62\0\10\3\1\0\16\3\1\0\26\3"+
    "\5\0\1\3\17\0\120\3\7\0\1\3\21\0\2\3"+
    "\7\0\1\3\2\0\1\3\5\0\325\3\55\5\3\3"+
    "\7\0\7\5\2\3\12\0\4\3\1\5\u0171\3\54\5"+
    "\16\0\5\3\306\5\13\3\7\0\51\3\104\5\7\0"+
    "\1\5\4\3\12\0\u0156\3\1\5\117\3\4\5\1\3"+
    "\33\5\1\3\2\5\1\3\1\5\2\3\1\5\1\3"+
    "\12\5\1\3\4\5\1\3\1\5\1\3\1\5\6\3"+
    "\1\5\4\3\1\5\1\3\1\5\1\3\1\5\1\3"+
    "\3\5\1\3\2\5\1\3\1\5\2\3\1\5\1\3"+
    "\1\5\1\3\1\5\1\3\1\5\1\3\1\5\1\3"+
    "\2\5\1\3\1\5\2\3\4\5\1\3\7\5\1\3"+
    "\4\5\1\3\4\5\1\3\1\5\1\3\12\5\1\3"+
    "\21\5\5\3\3\5\1\3\5\5\1\3\21\5\104\3"+
    "\327\5\51\3\65\5\13\3\336\5\2\3\u0182\5\16\3"+
    "\u0131\5\37\3\36\5\343\3\1\0\36\3\140\0\200\3"+
    "\360\0\20\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29952];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\1\5\1\6\1\1"+
    "\26\0\1\7\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[34];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\32\0\64\0\64\0\116\0\64\0\64\0\64"+
    "\0\150\0\202\0\234\0\266\0\320\0\352\0\u0104\0\u011e"+
    "\0\u0138\0\u0152\0\u016c\0\u0186\0\u01a0\0\u01ba\0\u01d4\0\u01ee"+
    "\0\u0208\0\u0222\0\u023c\0\u0256\0\u0270\0\u028a\0\u02a4\0\u02be"+
    "\0\64\0\u02d8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[34];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\3\1\5\2\3\1\6\1\7\1\10"+
    "\21\3\2\4\1\3\1\5\1\11\1\12\1\6\1\7"+
    "\1\10\20\11\34\0\1\4\27\0\1\11\4\0\1\11"+
    "\4\0\20\11\13\0\1\13\1\14\1\15\1\0\1\16"+
    "\2\0\1\17\1\20\3\0\1\21\27\0\1\22\25\0"+
    "\1\23\35\0\1\24\27\0\1\25\32\0\1\26\32\0"+
    "\1\27\25\0\1\30\35\0\1\31\16\0\1\32\50\0"+
    "\1\33\25\0\1\34\34\0\1\35\25\0\1\36\32\0"+
    "\1\37\27\0\1\35\34\0\1\35\16\0\1\40\30\0"+
    "\1\26\25\0\1\41\43\0\1\35\37\0\1\26\26\0"+
    "\1\42\24\0\1\35\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[754];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\1\1\3\11\2\1\26\0\1\11\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[34];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Node yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Error("Illegal character <" + yytext()+">");
            }
            // fall through
          case 8: break;
          case 2:
            { /* white space so do nothing */
            }
            // fall through
          case 9: break;
          case 3:
            { return new LParenNode();
            }
            // fall through
          case 10: break;
          case 4:
            { return new RParenNode();
            }
            // fall through
          case 11: break;
          case 5:
            { return new CommaNode();
            }
            // fall through
          case 12: break;
          case 6:
            { return new IDNode (yytext());
            }
            // fall through
          case 13: break;
          case 7:
            { return new PrimitiveTypeNode (yytext());
            }
            // fall through
          case 14: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
