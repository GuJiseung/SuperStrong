.class public final Lk1/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/f;


# static fields
.field public static final j:Le2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le2/g<",
            "Ljava/lang/Class<",
            "*>;[B>;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Ll1/b;

.field public final c:Li1/f;

.field public final d:Li1/f;

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final h:Li1/h;

.field public final i:Li1/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li1/l<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Le2/g;

    const-wide/16 v1, 0x32

    invoke-direct {v0, v1, v2}, Le2/g;-><init>(J)V

    sput-object v0, Lk1/y;->j:Le2/g;

    return-void
.end method

.method public constructor <init>(Ll1/b;Li1/f;Li1/f;IILi1/l;Ljava/lang/Class;Li1/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/b;",
            "Li1/f;",
            "Li1/f;",
            "II",
            "Li1/l<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Li1/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/y;->b:Ll1/b;

    iput-object p2, p0, Lk1/y;->c:Li1/f;

    iput-object p3, p0, Lk1/y;->d:Li1/f;

    iput p4, p0, Lk1/y;->e:I

    iput p5, p0, Lk1/y;->f:I

    iput-object p6, p0, Lk1/y;->i:Li1/l;

    iput-object p7, p0, Lk1/y;->g:Ljava/lang/Class;

    iput-object p8, p0, Lk1/y;->h:Li1/h;

    return-void
.end method


# virtual methods
.method public final b(Ljava/security/MessageDigest;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lk1/y;->b:Ll1/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll1/b;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, [B

    .line 8
    .line 9
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v3, p0, Lk1/y;->e:I

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, Lk1/y;->f:I

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lk1/y;->d:Li1/f;

    .line 29
    .line 30
    invoke-interface {v2, p1}, Li1/f;->b(Ljava/security/MessageDigest;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lk1/y;->c:Li1/f;

    .line 34
    .line 35
    invoke-interface {v2, p1}, Li1/f;->b(Ljava/security/MessageDigest;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lk1/y;->i:Li1/l;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v2, p1}, Li1/f;->b(Ljava/security/MessageDigest;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object v2, p0, Lk1/y;->h:Li1/h;

    .line 49
    .line 50
    invoke-virtual {v2, p1}, Li1/h;->b(Ljava/security/MessageDigest;)V

    .line 51
    .line 52
    .line 53
    sget-object v2, Lk1/y;->j:Le2/g;

    .line 54
    .line 55
    iget-object v3, p0, Lk1/y;->g:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Le2/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, [B

    .line 62
    .line 63
    if-nez v4, :cond_1

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    sget-object v5, Li1/f;->a:Ljava/nio/charset/Charset;

    .line 70
    .line 71
    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v2, v3, v4}, Le2/g;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-virtual {p1, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v0, v1}, Ll1/b;->put(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-void
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
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lk1/y;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lk1/y;

    iget v0, p1, Lk1/y;->f:I

    iget v2, p0, Lk1/y;->f:I

    if-ne v2, v0, :cond_0

    iget v0, p0, Lk1/y;->e:I

    iget v2, p1, Lk1/y;->e:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lk1/y;->i:Li1/l;

    iget-object v2, p1, Lk1/y;->i:Li1/l;

    invoke-static {v0, v2}, Le2/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk1/y;->g:Ljava/lang/Class;

    iget-object v2, p1, Lk1/y;->g:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk1/y;->c:Li1/f;

    iget-object v2, p1, Lk1/y;->c:Li1/f;

    invoke-interface {v0, v2}, Li1/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk1/y;->d:Li1/f;

    iget-object v2, p1, Lk1/y;->d:Li1/f;

    invoke-interface {v0, v2}, Li1/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk1/y;->h:Li1/h;

    iget-object p1, p1, Lk1/y;->h:Li1/h;

    invoke-virtual {v0, p1}, Li1/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lk1/y;->c:Li1/f;

    invoke-interface {v0}, Li1/f;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk1/y;->d:Li1/f;

    invoke-interface {v1}, Li1/f;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lk1/y;->e:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lk1/y;->f:I

    add-int/2addr v1, v0

    iget-object v0, p0, Lk1/y;->i:Li1/l;

    if-eqz v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lk1/y;->g:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk1/y;->h:Li1/h;

    invoke-virtual {v1}, Li1/h;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ResourceCacheKey{sourceKey="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lk1/y;->c:Li1/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk1/y;->d:Li1/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lk1/y;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lk1/y;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodedResourceClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk1/y;->g:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformation=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk1/y;->i:Li1/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk1/y;->h:Li1/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
