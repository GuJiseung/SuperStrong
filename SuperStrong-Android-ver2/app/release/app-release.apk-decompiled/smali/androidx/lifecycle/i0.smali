.class public final Landroidx/lifecycle/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/i0$b;,
        Landroidx/lifecycle/i0$d;,
        Landroidx/lifecycle/i0$c;,
        Landroidx/lifecycle/i0$a;
    }
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/k0;

.field public final b:Landroidx/lifecycle/i0$b;

.field public final c:Lu0/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/i0$b;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lu0/a$a;->b:Lu0/a$a;

    invoke-direct {p0, p1, p2, v0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/i0$b;Lu0/a;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/i0$b;Lu0/a;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/i0;->a:Landroidx/lifecycle/k0;

    iput-object p2, p0, Landroidx/lifecycle/i0;->b:Landroidx/lifecycle/i0$b;

    iput-object p3, p0, Landroidx/lifecycle/i0;->c:Lu0/a;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/l0;)V
    .locals 4

    const-string v0, "owner"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/l0;->t()Landroidx/lifecycle/k0;

    move-result-object v0

    const-string v1, "owner.viewModelStore"

    invoke-static {v0, v1}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v1, p1, Landroidx/lifecycle/h;

    if-eqz v1, :cond_0

    move-object v2, p1

    check-cast v2, Landroidx/lifecycle/h;

    invoke-interface {v2}, Landroidx/lifecycle/h;->j()Landroidx/lifecycle/i0$b;

    move-result-object v2

    const-string v3, "owner.defaultViewModelProviderFactory"

    invoke-static {v2, v3}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    sget-object v2, Landroidx/lifecycle/i0$c;->a:Landroidx/lifecycle/i0$c;

    if-nez v2, :cond_1

    .line 4
    new-instance v2, Landroidx/lifecycle/i0$c;

    invoke-direct {v2}, Landroidx/lifecycle/i0$c;-><init>()V

    .line 5
    sput-object v2, Landroidx/lifecycle/i0$c;->a:Landroidx/lifecycle/i0$c;

    .line 6
    :cond_1
    sget-object v2, Landroidx/lifecycle/i0$c;->a:Landroidx/lifecycle/i0$c;

    .line 7
    invoke-static {v2}, Ll4/f;->c(Ljava/lang/Object;)V

    :goto_0
    if-eqz v1, :cond_2

    .line 8
    check-cast p1, Landroidx/lifecycle/h;

    invoke-interface {p1}, Landroidx/lifecycle/h;->k()Lu0/a;

    move-result-object p1

    const-string v1, "{\n        owner.defaultV\u2026ModelCreationExtras\n    }"

    invoke-static {p1, v1}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    sget-object p1, Lu0/a$a;->b:Lu0/a$a;

    .line 9
    :goto_1
    invoke-direct {p0, v0, v2, p1}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/i0$b;Lu0/a;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Landroidx/lifecycle/f0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/f0;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/i0;->b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/f0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/f0;
    .locals 5

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p2, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/i0;->a:Landroidx/lifecycle/k0;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/lifecycle/k0;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroidx/lifecycle/f0;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object v3, p0, Landroidx/lifecycle/i0;->b:Landroidx/lifecycle/i0$b;

    .line 21
    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    instance-of p1, v3, Landroidx/lifecycle/i0$d;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    check-cast v3, Landroidx/lifecycle/i0$d;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const-string p1, "viewModel"

    .line 35
    .line 36
    invoke-static {v1, p1}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v1}, Landroidx/lifecycle/i0$d;->c(Landroidx/lifecycle/f0;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    if-eqz v1, :cond_2

    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 46
    .line 47
    const-string p2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_3
    new-instance v1, Lu0/d;

    .line 54
    .line 55
    iget-object v2, p0, Landroidx/lifecycle/i0;->c:Lu0/a;

    .line 56
    .line 57
    invoke-direct {v1, v2}, Lu0/d;-><init>(Lu0/a;)V

    .line 58
    .line 59
    .line 60
    sget-object v2, Landroidx/lifecycle/j0;->a:Landroidx/lifecycle/j0;

    .line 61
    .line 62
    iget-object v4, v1, Lu0/a;->a:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    invoke-interface {v4, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-interface {v3, p1, v1}, Landroidx/lifecycle/i0$b;->b(Ljava/lang/Class;Lu0/d;)Landroidx/lifecycle/f0;

    .line 68
    .line 69
    .line 70
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    goto :goto_1

    .line 72
    :catch_0
    invoke-interface {v3, p1}, Landroidx/lifecycle/i0$b;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_1
    iget-object v0, v0, Landroidx/lifecycle/k0;->a:Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    check-cast p2, Landroidx/lifecycle/f0;

    .line 83
    .line 84
    if-eqz p2, :cond_4

    .line 85
    .line 86
    invoke-virtual {p2}, Landroidx/lifecycle/f0;->b()V

    .line 87
    .line 88
    .line 89
    :cond_4
    return-object p1
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
