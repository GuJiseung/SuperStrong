.class public final Le4/f$a$a;
.super Ll4/g;
.source "SourceFile"

# interfaces
.implements Lk4/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le4/f$a;->a(Le4/f;Le4/f;)Le4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll4/g;",
        "Lk4/p<",
        "Le4/f;",
        "Le4/f$b;",
        "Le4/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Le4/f$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le4/f$a$a;

    invoke-direct {v0}, Le4/f$a$a;-><init>()V

    sput-object v0, Le4/f$a$a;->c:Le4/f$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ll4/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Le4/f;

    .line 2
    .line 3
    check-cast p2, Le4/f$b;

    .line 4
    .line 5
    const-string v0, "acc"

    .line 6
    .line 7
    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "element"

    .line 11
    .line 12
    invoke-static {p2, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Le4/f$b;->getKey()Le4/f$c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p1, v0}, Le4/f;->minusKey(Le4/f$c;)Le4/f;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object v0, Le4/g;->b:Le4/g;

    .line 24
    .line 25
    if-ne p1, v0, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    sget v1, Le4/e;->a:I

    .line 29
    .line 30
    sget-object v1, Le4/e$a;->b:Le4/e$a;

    .line 31
    .line 32
    invoke-interface {p1, v1}, Le4/f;->get(Le4/f$c;)Le4/f$b;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Le4/e;

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    new-instance v0, Le4/c;

    .line 41
    .line 42
    invoke-direct {v0, p2, p1}, Le4/c;-><init>(Le4/f$b;Le4/f;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    move-object p2, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-interface {p1, v1}, Le4/f;->minusKey(Le4/f$c;)Le4/f;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    new-instance p1, Le4/c;

    .line 54
    .line 55
    invoke-direct {p1, v2, p2}, Le4/c;-><init>(Le4/f$b;Le4/f;)V

    .line 56
    .line 57
    .line 58
    move-object p2, p1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    new-instance v0, Le4/c;

    .line 61
    .line 62
    new-instance v1, Le4/c;

    .line 63
    .line 64
    invoke-direct {v1, p2, p1}, Le4/c;-><init>(Le4/f$b;Le4/f;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, v2, v1}, Le4/c;-><init>(Le4/f$b;Le4/f;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :goto_1
    return-object p2
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method
